import com.pi4j.io.i2c.I2CBus;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class OledDisplay implements Cloneable {

    /**
     * @param args args
     */
    public static void main(String[] args) {

        final Ssd1306v2 display = Ssd1306v2.createI2CDisplay(I2CBus.BUS_1);

        if (display == null) {
            logMsg("SSD1306 display creating fail.");
            return;
        }

        for (String arg : args) {
//                display.show6x8FontMessage(arg);

            new Timer().scheduleAtFixedRate(
                    new TimerTask() {
                        private int index = -1;

                        @Override
                        public void run() {
                            try {
                                display.showFontDemoScreen(Ssd1306v2.FONTS_ARRAY[++index % 23].getName(), arg);
                            } catch (IOException e) {
                                logMsg("Oled message show fail. " + e.getMessage());
                                e.printStackTrace();
                            }

                        }
                    },
                    0,
                    3000
            );
        }
    }

    private static void logMsg(String msg) {
        System.out.println(msg);
    }

}