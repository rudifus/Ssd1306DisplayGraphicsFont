package fonts;

import java.util.Arrays;

public final class FontItem {

    private String name;

    private int[][] charBytes;

    private int[] widths;


    public FontItem(String name, int[][] charBytes, int[] widths) {
        super();
        this.name = name;
        this.charBytes = charBytes;
        this.widths = widths;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final int[][] getCharBytes() {
        return this.charBytes;
    }

    public final void setCharBytes(int[][] charBytes) {
        this.charBytes = charBytes;
    }

    public final int[] getWidths() {
        return this.widths;
    }

    public final void setWidths(int[] widths) {
        this.widths = widths;
    }

    public String toString() {
        return "fonts.FontItem(name=" + this.name + ", charBytes=" + Arrays.toString(this.charBytes) + ", widths=" + Arrays.toString(this.widths) + ")";
    }
}
