import com.pi4j.io.i2c.I2CBus;

import java.io.IOException;
import java.text.Normalizer;
import java.util.Arrays;

import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;

/**
 * Driver for controlling the SSD1306 OLED display.
 */
public class Ssd1306 /*implements Closeable*/ {

    private I2CDevice i2CDevice;

    // Screen configuration constants.
    private static final int DEFAULT_WIDTH = 128;
    private static final int DEFAULT_HEIGHT = 64;

    /**
     * Ssd1306deprecated Use {@link #I2C_ADDRESS_SA0_LOW} instead.
     */
    @Deprecated
    public static final int I2C_ADDRESS = 0x3C;
    /**
     * @deprecated Use {@link #I2C_ADDRESS_SA0_HIGH} instead.
     */
    @Deprecated
    public static final int I2C_ADDRESS_ALT = 0x3D;

    /**
     * I2C address for this peripheral when SA0 pin is connected to ground.
     */
    public static final int I2C_ADDRESS_SA0_LOW = 0x3C;
    /**
     * I2C address for this peripheral when SA0 pin is high.
     */
    public static final int I2C_ADDRESS_SA0_HIGH = 0x3D;

    // Protocol constants
    private static final int COMMAND_ACTIVATE_SCROLL = 0x2F;
    private static final int COMMAND_DEACTIVATE_SCROLL = 0x2E;
    private static final int COMMAND_RIGHT_HORIZONTAL_SCROLL = 0x26;
    private static final int COMMAND_LEFT_HORIZONTAL_SCROLL = 0x27;
    private static final int COMMAND_VERTICAL_AND_RIGHT_HORIZONTAL_SCROLL = 0x29;
    private static final int COMMAND_VERTICAL_AND_LEFT_HORIZONTAL_SCROLL = 0x2A;
    private static final int COMMAND_NORMAL_DISPLAY = 0xA6;
    private static final int COMMAND_INVERT_DISPLAY = 0xA7;
    private static final int COMMAND_DISPLAY_ON = 0xAF;
    private static final int COMMAND_DISPLAY_OFF = 0xAE;
    private static final int COMMAND_START_LINE = 0x40;
    private static final int COMMAND_CONTRAST_LEVEL = 0x81;
    private static final int DATA_OFFSET = 1;
    private static final int INIT_CHARGE_PUMP = 0x8D;
    private static final int INIT_CLK_DIV = 0xD5;
    private static final int INIT_COMSCAN_DEC = 0xC8;
    private static final int INIT_DISPLAY_NO_OFFSET = 0x0;
    private static final int INIT_DISPLAY_OFFSET = 0xD3;
    private static final int INIT_DUTY_CYCLE_1_64 = 0x3F;
    private static final int INIT_MEMORY_ADDRESSING_HORIZ = 0x0;
    private static final int INIT_RESISTER_RATIO = 0x80;
    private static final int INIT_SEGREMAP = 0xA1;
    private static final int INIT_SET_MEMORY_ADDRESSING_MODE = 0x20;

    private static final byte SSD1306_DISPLAY_WRITE = (byte) 0xA4;

    private static final byte[] INIT_PAYLOAD = new byte[]{
            // Step 1: Start with the display off
            0, (byte) COMMAND_DISPLAY_OFF,

            // Step 2: Set up the required communication / power settings
            0, (byte) INIT_SEGREMAP,
            0, (byte) INIT_COMSCAN_DEC,
            0, (byte) INIT_DUTY_CYCLE_1_64,
            0, (byte) INIT_CLK_DIV,
            0, (byte) INIT_RESISTER_RATIO,

            // Step 3: Set display input configuration and start. This will start the display all
            // on, you must transmit START_LINE to present the memory-based mBuffer to the screen
            0, (byte) INIT_SET_MEMORY_ADDRESSING_MODE,
            0, (byte) INIT_MEMORY_ADDRESSING_HORIZ,
            0, (byte) INIT_DISPLAY_OFFSET,
            0, (byte) INIT_DISPLAY_NO_OFFSET,
            0, (byte) COMMAND_DISPLAY_ON,
            0, (byte) INIT_CHARGE_PUMP
    };

    private static final int[][] FONT6x8 = {
            {0x06, 0x08, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00}, // columns, rows, num_bytes_per_char
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00}, // space 0x20  32
            {0x20, 0x20, 0x20, 0x20, 0x20, 0x00, 0x20, 0x00}, // !  33
            {0x50, 0x50, 0x50, 0x00, 0x00, 0x00, 0x00, 0x00}, // "
            {0x50, 0x50, 0xF8, 0x50, 0xF8, 0x50, 0x50, 0x00}, // #
            {0x20, 0x78, 0xA0, 0x70, 0x28, 0xF0, 0x20, 0x00}, // $
            {0xC0, 0xC8, 0x10, 0x20, 0x40, 0x98, 0x18, 0x00}, // %
            {0x40, 0xA0, 0xA0, 0x40, 0xA8, 0x90, 0x68, 0x00}, // &
            {0x30, 0x30, 0x20, 0x40, 0x00, 0x00, 0x00, 0x00}, // '
            {0x10, 0x20, 0x40, 0x40, 0x40, 0x20, 0x10, 0x00}, // (
            {0x40, 0x20, 0x10, 0x10, 0x10, 0x20, 0x40, 0x00}, // )
            {0x00, 0x20, 0xA8, 0x70, 0x70, 0xA8, 0x20, 0x00}, // *
            {0x00, 0x20, 0x20, 0xF8, 0x20, 0x20, 0x00, 0x00}, // +
            {0x00, 0x00, 0x00, 0x00, 0x30, 0x30, 0x20, 0x40}, // ,
            {0x00, 0x00, 0x00, 0xF8, 0x00, 0x00, 0x00, 0x00}, // -
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x30, 0x30, 0x00}, // .
            {0x00, 0x08, 0x10, 0x20, 0x40, 0x80, 0x00, 0x00}, // / (forward slash)
            {0x70, 0x88, 0x88, 0xA8, 0x88, 0x88, 0x70, 0x00}, // 0 0x30
            {0x20, 0x60, 0x20, 0x20, 0x20, 0x20, 0x70, 0x00}, // 1
            {0x70, 0x88, 0x08, 0x70, 0x80, 0x80, 0xF8, 0x00}, // 2
            {0xF8, 0x08, 0x10, 0x30, 0x08, 0x88, 0x70, 0x00}, // 3
            {0x10, 0x30, 0x50, 0x90, 0xF8, 0x10, 0x10, 0x00}, // 4
            {0xF8, 0x80, 0xF0, 0x08, 0x08, 0x88, 0x70, 0x00}, // 5
            {0x38, 0x40, 0x80, 0xF0, 0x88, 0x88, 0x70, 0x00}, // 6
            {0xF8, 0x08, 0x08, 0x10, 0x20, 0x40, 0x80, 0x00}, // 7
            {0x70, 0x88, 0x88, 0x70, 0x88, 0x88, 0x70, 0x00}, // 8
            {0x70, 0x88, 0x88, 0x78, 0x08, 0x10, 0xE0, 0x00}, // 9
            {0x00, 0x00, 0x20, 0x00, 0x20, 0x00, 0x00, 0x00}, // :
            {0x00, 0x00, 0x20, 0x00, 0x20, 0x20, 0x40, 0x00}, // ;
            {0x08, 0x10, 0x20, 0x40, 0x20, 0x10, 0x08, 0x00}, // <
            {0x00, 0x00, 0xF8, 0x00, 0xF8, 0x00, 0x00, 0x00}, // =
            {0x40, 0x20, 0x10, 0x08, 0x10, 0x20, 0x40, 0x00}, // >
            {0x70, 0x88, 0x08, 0x30, 0x20, 0x00, 0x20, 0x00}, // ?
            {0x70, 0x88, 0xA8, 0xB8, 0xB0, 0x80, 0x78, 0x00}, // @ 0x40   64
            {0x20, 0x50, 0x88, 0x88, 0xF8, 0x88, 0x88, 0x00}, // A     65
            {0xF0, 0x88, 0x88, 0xF0, 0x88, 0x88, 0xF0, 0x00}, // B
            {0x70, 0x88, 0x80, 0x80, 0x80, 0x88, 0x70, 0x00}, // C
            {0xF0, 0x88, 0x88, 0x88, 0x88, 0x88, 0xF0, 0x00}, // D
            {0xF8, 0x80, 0x80, 0xF0, 0x80, 0x80, 0xF8, 0x00}, // E
            {0xF8, 0x80, 0x80, 0xF0, 0x80, 0x80, 0x80, 0x00}, // F
            {0x78, 0x88, 0x80, 0x80, 0x98, 0x88, 0x78, 0x00}, // G
            {0x88, 0x88, 0x88, 0xF8, 0x88, 0x88, 0x88, 0x00}, // H
            {0x70, 0x20, 0x20, 0x20, 0x20, 0x20, 0x70, 0x00}, // I
            {0x38, 0x10, 0x10, 0x10, 0x10, 0x90, 0x60, 0x00}, // J
            {0x88, 0x90, 0xA0, 0xC0, 0xA0, 0x90, 0x88, 0x00}, // K
            {0x80, 0x80, 0x80, 0x80, 0x80, 0x80, 0xF8, 0x00}, // L
            {0x88, 0xD8, 0xA8, 0xA8, 0xA8, 0x88, 0x88, 0x00}, // M
            {0x88, 0x88, 0xC8, 0xA8, 0x98, 0x88, 0x88, 0x00}, // N
            {0x70, 0x88, 0x88, 0x88, 0x88, 0x88, 0x70, 0x00}, // O
            {0xF0, 0x88, 0x88, 0xF0, 0x80, 0x80, 0x80, 0x00}, // P 0x50
            {0x70, 0x88, 0x88, 0x88, 0xA8, 0x90, 0x68, 0x00}, // Q
            {0xF0, 0x88, 0x88, 0xF0, 0xA0, 0x90, 0x88, 0x00}, // R
            {0x70, 0x88, 0x80, 0x70, 0x08, 0x88, 0x70, 0x00}, // S
            {0xF8, 0xA8, 0x20, 0x20, 0x20, 0x20, 0x20, 0x00}, // T
            {0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x70, 0x00}, // U
            {0x88, 0x88, 0x88, 0x88, 0x88, 0x50, 0x20, 0x00}, // V
            {0x88, 0x88, 0x88, 0xA8, 0xA8, 0xA8, 0x50, 0x00}, // W
            {0x88, 0x88, 0x50, 0x20, 0x50, 0x88, 0x88, 0x00}, // X
            {0x88, 0x88, 0x50, 0x20, 0x20, 0x20, 0x20, 0x00}, // Y
            {0xF8, 0x08, 0x10, 0x70, 0x40, 0x80, 0xF8, 0x00}, // Z
            {0x78, 0x40, 0x40, 0x40, 0x40, 0x40, 0x78, 0x00}, // [
            {0x00, 0x80, 0x40, 0x20, 0x10, 0x08, 0x00, 0x00}, // \ (back slash)
            {0x78, 0x08, 0x08, 0x08, 0x08, 0x08, 0x78, 0x00}, // ]
            {0x20, 0x50, 0x88, 0x00, 0x00, 0x00, 0x00, 0x00}, // ^
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xF8, 0x00}, // _
            {0x60, 0x60, 0x20, 0x10, 0x00, 0x00, 0x00, 0x00}, // ` 0x60
            {0x00, 0x00, 0x60, 0x10, 0x70, 0x90, 0x78, 0x00}, // a
            {0x80, 0x80, 0xB0, 0xC8, 0x88, 0xC8, 0xB0, 0x00}, // b
            {0x00, 0x00, 0x70, 0x88, 0x80, 0x88, 0x70, 0x00}, // c
            {0x08, 0x08, 0x68, 0x98, 0x88, 0x98, 0x68, 0x00}, // d
            {0x00, 0x00, 0x70, 0x88, 0xF8, 0x80, 0x70, 0x00}, // e
            {0x10, 0x28, 0x20, 0x70, 0x20, 0x20, 0x20, 0x00}, // f
            {0x00, 0x00, 0x70, 0x98, 0x98, 0x68, 0x08, 0x70}, // g
            {0x80, 0x80, 0xB0, 0xC8, 0x88, 0x88, 0x88, 0x00}, // h
            {0x20, 0x00, 0x60, 0x20, 0x20, 0x20, 0x70, 0x00}, // i
            {0x10, 0x00, 0x10, 0x10, 0x10, 0x90, 0x60, 0x00}, // j
            {0x80, 0x80, 0x90, 0xA0, 0xC0, 0xA0, 0x90, 0x00}, // k
            {0x60, 0x20, 0x20, 0x20, 0x20, 0x20, 0x70, 0x00}, // l
            {0x00, 0x00, 0xD0, 0xA8, 0xA8, 0xA8, 0xA8, 0x00}, // m
            {0x00, 0x00, 0xB0, 0xC8, 0x88, 0x88, 0x88, 0x00}, // n
            {0x00, 0x00, 0x70, 0x88, 0x88, 0x88, 0x70, 0x00}, // o
            {0x00, 0x00, 0xB0, 0xC8, 0xC8, 0xB0, 0x80, 0x80}, // p 0x70
            {0x00, 0x00, 0x68, 0x98, 0x98, 0x68, 0x08, 0x08}, // q
            {0x00, 0x00, 0xB0, 0xC8, 0x80, 0x80, 0x80, 0x00}, // r
            {0x00, 0x00, 0x78, 0x80, 0x70, 0x08, 0xF0, 0x00}, // s
            {0x20, 0x20, 0xF8, 0x20, 0x20, 0x28, 0x10, 0x00}, // t
            {0x00, 0x00, 0x88, 0x88, 0x88, 0x98, 0x68, 0x00}, // u
            {0x00, 0x00, 0x88, 0x88, 0x88, 0x50, 0x20, 0x00}, // v
            {0x00, 0x00, 0x88, 0x88, 0xA8, 0xA8, 0x50, 0x00}, // w
            {0x00, 0x00, 0x88, 0x50, 0x20, 0x50, 0x88, 0x00}, // x
            {0x00, 0x00, 0x88, 0x88, 0x78, 0x08, 0x88, 0x70}, // y
            {0x00, 0x00, 0xF8, 0x10, 0x20, 0x40, 0xF8, 0x00}, // z
            {0x10, 0x20, 0x20, 0x40, 0x20, 0x20, 0x10, 0x00}, // {
            {0x20, 0x20, 0x20, 0x00, 0x20, 0x20, 0x20, 0x00}, // |
            {0x40, 0x20, 0x20, 0x10, 0x20, 0x20, 0x40, 0x00}, // }
            {0x40, 0xA8, 0x10, 0x00, 0x00, 0x00, 0x00, 0x00}, // ~
            {0x70, 0xD8, 0xD8, 0x70, 0x00, 0x00, 0x00, 0x00}  // DEL
    };
//    public enum ScrollMode {
//        RightHorizontal,
//        LeftHorizontal,
//        VerticalRightHorizontal,
//        VerticalLeftHorizontal
//    }

    // Screen dimension.
    private int mWidth;
    private int mHeight;

    // Holds the i2c payload.
    private byte[] mBuffer;

    /**
     * Create a new Ssd1306 driver connected to the named I2C bus
     *
     * @param i2cBus I2C bus the display is connected to
     * @throws IOException
     */
    public Ssd1306(I2CBus i2cBus) throws IOException {
        this(i2cBus, I2C_ADDRESS_SA0_LOW);
    }

    /**
     * Create a new Ssd1306 driver connected to the named I2C bus
     * with the given dimensions.
     *
     * @param i2cBus I2C bus the display is connected to
     * @param width  display width in pixels.
     * @param height display height in pixels.
     * @throws IOException
     */
    public Ssd1306(I2CBus i2cBus, int width, int height) throws IOException {
        this(i2cBus, I2C_ADDRESS_SA0_LOW, width, height);
    }

    /**
     * Create a new Ssd1306 driver connected to the named I2C bus and address
     *
     * @param i2cBus     I2C bus the display is connected to
     * @param i2cAddress I2C address of the display
     * @throws IOException
     */
    public Ssd1306(I2CBus i2cBus, int i2cAddress) throws IOException {
        this(i2cBus, i2cAddress, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    /**
     * Create a new Ssd1306 driver connected to the named I2C bus and address
     * with the given dimensions.
     *
     * @param i2cBus     I2C bus the display is connected to
     * @param i2cAddress I2C address of the display
     * @param width      display width in pixels.
     * @param height     display height in pixels.
     * @throws IOException
     */
    public Ssd1306(I2CBus i2cBus, int i2cAddress, int width, int height) throws IOException {
        try {
            init(i2cBus.getDevice(i2cAddress), width, height);
        } catch (IOException | RuntimeException e) {
//            try {
            close();
//            } catch (IOException | RuntimeException ignored) {
//            }
            throw e;
        }
    }

    /**
     * Create a new Ssd1306 driver connected to the given device
     *
     * @param device I2C device of the display
     * @throws IOException
     */
    Ssd1306(I2CDevice device) throws IOException {
        init(device, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    /**
     * Recommended start sequence for initializing the communications with the OLED display.
     * WARNING: If you change this code, power cycle your display before testing.
     *
     * @throws IOException
     */
    private void init(I2CDevice device, int width, int height) throws IOException {
        i2CDevice = device;
        mWidth = width;
        mHeight = height;
        mBuffer = new byte[((width * height) / 8) + 1];

        mBuffer[0] = (byte) COMMAND_START_LINE;

        // Recommended initialization sequence based on http://goo.gl/VSu0C8
        i2CDevice.write(INIT_PAYLOAD);
        stopScroll();
    }

    public void close() /*throws IOException*/ {
        if (i2CDevice != null) {
//            try {
//                i2CDevice.close();
//            } finally {
            i2CDevice = null;
//            }
        }
    }

    /**
     * @return the width of the display
     */
    public int getLcdWidth() {
        return mWidth;
    }

    /**
     * @return the height of the display
     */
    public int getLcdHeight() {
        return mHeight;
    }

    /**
     * Clears all pixel data in the display buffer. This will be rendered the next time
     * {@link #show()} is called.
     */
    public void clearPixels() {
        Arrays.fill(mBuffer, DATA_OFFSET, mBuffer.length, (byte) 0);
    }

    /**
     * Sets a specific pixel in the display buffer to on or off. This will be rendered the next time
     * {@link #show()} is called.
     *
     * @param x  The horizontal coordinate.
     * @param y  The vertical coordinate.
     * @param on Set to true to enable the pixel; false to disable the pixel.
     */
    public void setPixel(int x, int y, boolean on) throws IllegalArgumentException {
        if (x < 0 || y < 0 || x >= mWidth || y >= mHeight) {
            throw new IllegalArgumentException("pixel out of bound:" + x + "," + y);
        }
        final int index = DATA_OFFSET + x + ((y / 8) * mWidth);
        final int valueY = 1 << y % 8;
        if (on) {
            mBuffer[index] |= valueY;
        } else {
            mBuffer[index] &= ~valueY;
        }
    }

    /**
     * Sets a specific row pixels array in the display buffer to on or off. This will be rendered the next time
     * {@link #show()} is called.
     *
     * @param x       The horizontal coordinate.
     * @param y       The vertical coordinate.
     * @param onArray array of Sets to true to enable the pixel; false to disable the pixel.
     */
    public void setRowPixelArray(final int x, final int y, final boolean[] onArray) throws IllegalArgumentException {
        final int arrayLength = onArray.length;
        if (arrayLength == 0) {
            throw new IllegalArgumentException("empty pixel array not allowed");
        }
        if (x < 0 || y < 0 || x >= mWidth || y >= mHeight) {
            throw new IllegalArgumentException("pixel out of bound:" + x + "," + y);
        }

        // compute first array element buffer index
        final int index = DATA_OFFSET + x + ((y / 8) * mWidth);
        final int valueY = 1 << y % 8;
        final int negValueY = ~valueY;
        for (int i = 0; i < arrayLength; ++i) {
            if (onArray[i]) {
                mBuffer[index + i] |= valueY;
            } else {
                mBuffer[index + i] &= negValueY;
            }
        }
    }

    /**
     * Sets the contrast for the display.
     *
     * @param level The contrast level (0-255).
     * @throws IllegalStateException
     * @throws IllegalArgumentException
     */
    public void setContrast(int level) throws IOException, IllegalArgumentException {
        if (level < 0 || level > 255) {
            throw new IllegalArgumentException("Invalid contrast " + level +
                    ", level must be between 0 and 255");
        }
        i2cWriteRegByte(COMMAND_CONTRAST_LEVEL);
        i2cWriteRegByte(level);
    }

    /**
     * Sets if the backlight should be dimmed
     *
     * @param dim Dim state
     * @throws IllegalStateException
     * @throws IllegalArgumentException
     */
    public void dim(boolean dim) throws IOException, IllegalArgumentException {
        setContrast(dim ? 0 : 0xCF);  // 0x9F
    }

    /**
     * Turns the display on and off.
     *
     * @param on Set to true to enable the display; set to false to disable the display.
     * @throws IOException
     * @throws IllegalStateException
     */
    public void setDisplayOn(boolean on) throws IOException, IllegalStateException {
        i2cWriteRegByte(on ? COMMAND_DISPLAY_ON : COMMAND_DISPLAY_OFF);
    }

    /**
     * Sets if the display should be inverted
     *
     * @param invert Invert state
     * @throws IOException
     * @throws IllegalStateException
     */
    public void invertDisplay(boolean invert) throws IOException, IllegalStateException {
        i2cWriteRegByte(invert ? COMMAND_INVERT_DISPLAY : COMMAND_NORMAL_DISPLAY);
    }

    /**
     * show provided message via 6x8 font
     *
     * @param messageArg characters to render on display
     * @throws IOException
     */
    public void show6x8FontMessage(final String messageArg) throws IOException {
        show6x8FontMessage(messageArg, true);
    }

    /**
     * show provided message rendered via 6x8 font
     *
     * @param messageArg characters to render on display
     * @param toNormalize true if to normalize otherwise leave input message untouched
     * @throws IOException
     */
    public void show6x8FontMessage(final String messageArg, final boolean toNormalize) throws IOException {
        final String message = normalizeMessage(messageArg);

        for (int j = 0; j < message.length(); ++j) {
            final char strChar = message.charAt(j);
            final int asciiIndex = strChar - 31;
            if (asciiIndex >= 0 && asciiIndex < FONT6x8.length) {
                final int[] char1Array = FONT6x8[asciiIndex];
//                logMsg("char [" + j + "] " + strChar);
                int offsetX = (j % 16) * 8;
                int offsetY = 8 * (j / 16);
                for (int i = 0; i < char1Array.length; ++i) {
                    final boolean[] rowArray = new boolean[8];
                    final int hex = char1Array[i];
                    rowArray[0] = (128 & hex) != 0;
                    rowArray[1] = (64 & hex) != 0;
                    rowArray[2] = (32 & hex) != 0;
                    rowArray[3] = (16 & hex) != 0;
                    rowArray[4] = (8 & hex) != 0;
                    rowArray[5] = (4 & hex) != 0;
                    rowArray[6] = (2 & hex) != 0;
                    rowArray[7] = (1 & hex) != 0;
                    setRowPixelArray(offsetX, i + offsetY, rowArray);
                }
//            } else {
//                logMsg("Char " + strChar + " IGNORED -> blank shown");
            }
        }
        show();
    }

    /**
     * normalize message by acute dialect signs removal
     *
     * @param message to normalize
     * @return normalized message
     */
    private String normalizeMessage(final String message) {
        final String messageOrig = message.isEmpty()
                ? ""
                : Normalizer.normalize(message, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return messageOrig.length() > mWidth ? messageOrig.substring(0, mWidth) : messageOrig;
    }

    /**
     * Renders the current pixel data to the screen.
     *
     * @throws IOException
     * @throws IllegalStateException
     */
    public void show() throws IOException, IllegalStateException {
        if (i2CDevice == null) {
            throw new IllegalStateException("I2C Device not open");
        }
        i2cWriteRegByte(SSD1306_DISPLAY_WRITE);
        i2CDevice.write(mBuffer);
    }

    /**
     * static Ssd1306 constructor. Creates I2C device for given I2C bus id
     * @param busId of I2C device
     * @return SSD1306 display controlled by I2C device
     */
    public static Ssd1306 createI2CDisplay(final int busId) {
        Ssd1306 ssd1306Display;
        try {
            final I2CBus i2CBus = I2CFactory.getInstance(busId);
            System.out.println("Found I2C BUS 1");
            ssd1306Display = new Ssd1306(i2CBus);
            ssd1306Display.clearPixels();
        } catch (I2CFactory.UnsupportedBusNumberException | IOException e) {
            System.err.println("Oled init fail. " + e.getMessage());
            e.printStackTrace();
            ssd1306Display = null;
        }

        return ssd1306Display;
    }

    /**
     * Start scrolling the display horizontally.
     *
     * @param startY     The starting row to scroll.
     * @param finishY    The ending row to scroll.
     * @param scrollMode Configures the direction that the display contents scroll.
     * @throws IOException
     * @throws IllegalStateException
     */
    /*public void startScroll(int startY, int finishY, ScrollMode scrollMode)
            throws IOException, IllegalStateException {
        if (i2CDevice == null) {
            throw new IllegalStateException("I2C Device not open");
        }

        int scrollModeVal = 0;
        switch (scrollMode) {
            case RightHorizontal:
                scrollModeVal = COMMAND_RIGHT_HORIZONTAL_SCROLL;
                break;
            case LeftHorizontal:
                scrollModeVal = COMMAND_LEFT_HORIZONTAL_SCROLL;
                break;
            case VerticalLeftHorizontal:
                scrollModeVal = COMMAND_VERTICAL_AND_LEFT_HORIZONTAL_SCROLL;
                break;
            case VerticalRightHorizontal:
                scrollModeVal = COMMAND_VERTICAL_AND_RIGHT_HORIZONTAL_SCROLL;
                break;
            default:
                // Should never happen
                break;
        }
        byte[] payload = new byte[]{
                0, (byte) scrollModeVal,
                0, 0,
                0, (byte) startY,
                0, 0,
                0, (byte) finishY,
                0, 0,
                0, (byte) 0xFF,
                0, COMMAND_ACTIVATE_SCROLL
        };
        i2CDevice.write(payload);
    }*/

    /**
     * Stop scrolling the display
     *
     * @throws IOException
     * @throws IllegalStateException
     */
    public void stopScroll() throws IOException, IllegalStateException {
        i2cWriteRegByte(COMMAND_DEACTIVATE_SCROLL);
    }

    private void i2cWriteRegByte(final int value) throws IOException, IllegalStateException {
        i2cWriteByte(0, value);
    }

    public void i2cWriteByte(final int register, final int value) throws IOException, IllegalStateException {
//        value &= 0xFF;
        if (i2CDevice == null) {
            throw new IllegalStateException("I2C Device not open");
        }
        i2CDevice.write(register, (byte) value);
    }
}
