package fonts;

public class RootSquare20px {
    private static final int[][] charsPixels = {
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [0] 6x10 ' ' 0x20
            {0x00, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00, 0x04, 0x00, 0x00},         // [1] 6x10 '!' 0x21
            {0x00, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [2] 6x10 '"' 0x22
            {0x00, 0x00, 0x00, 0x0A, 0x1F, 0x0A, 0x1F, 0x0A, 0x00, 0x00},         // [3] 6x10 '#' 0x23
            {0x00, 0x00, 0x04, 0x0F, 0x14, 0x0E, 0x05, 0x1E, 0x04, 0x00},         // [4] 6x10 '$' 0x24
            {0x00, 0x00, 0x00, 0x19, 0x1A, 0x04, 0x0B, 0x13, 0x00, 0x00},         // [5] 6x10 '%' 0x25
            {0x00, 0x00, 0x04, 0x0E, 0x11, 0x0C, 0x11, 0x0E, 0x04, 0x00},         // [6] 6x10 '&' 0x26
            {0x00, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [7] 6x10 ''' 0x27
            {0x00, 0x00, 0x02, 0x04, 0x08, 0x08, 0x08, 0x04, 0x02, 0x00},         // [8] 6x10 '(' 0x28
            {0x00, 0x00, 0x08, 0x04, 0x02, 0x02, 0x02, 0x04, 0x08, 0x00},         // [9] 6x10 ')' 0x29
            {0x00, 0x0A, 0x04, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [10] 6x10 '*' 0x2A
            {0x00, 0x00, 0x00, 0x04, 0x04, 0x1F, 0x04, 0x04, 0x00, 0x00},         // [11] 6x10 '+' 0x2B
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x08, 0x00},         // [12] 6x10 ',' 0x2C
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x00, 0x00, 0x00, 0x00},         // [13] 6x10 '-' 0x2D
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00},         // [14] 6x10 '.' 0x2E
            {0x00, 0x00, 0x01, 0x02, 0x04, 0x04, 0x04, 0x08, 0x10, 0x00},         // [15] 6x10 '/' 0x2F
            {0x00, 0x00, 0x00, 0x0E, 0x13, 0x15, 0x19, 0x0E, 0x00, 0x00},         // [16] 6x10 '0' 0x30
            {0x00, 0x00, 0x00, 0x1C, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [17] 6x10 '1' 0x31
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x06, 0x08, 0x1F, 0x00, 0x00},         // [18] 6x10 '2' 0x32
            {0x00, 0x00, 0x00, 0x1F, 0x01, 0x06, 0x01, 0x01, 0x02, 0x1C},         // [19] 6x10 '3' 0x33
            {0x00, 0x00, 0x08, 0x08, 0x08, 0x0A, 0x12, 0x1F, 0x02, 0x02},         // [20] 6x10 '4' 0x34
            {0x00, 0x00, 0x00, 0x1F, 0x10, 0x0E, 0x01, 0x1E, 0x00, 0x00},         // [21] 6x10 '5' 0x35
            {0x00, 0x06, 0x08, 0x10, 0x1E, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [22] 6x10 '6' 0x36
            {0x00, 0x00, 0x00, 0x1F, 0x01, 0x02, 0x04, 0x08, 0x10, 0x10},         // [23] 6x10 '7' 0x37
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x11, 0x0E, 0x11, 0x11, 0x0E},         // [24] 6x10 '8' 0x38
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x11, 0x0F, 0x01, 0x02, 0x04},         // [25] 6x10 '9' 0x39
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x04, 0x00, 0x00},         // [26] 6x10 ':' 0x3A
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x04, 0x08, 0x00},         // [27] 6x10 ';' 0x3B
            {0x00, 0x00, 0x00, 0x03, 0x0C, 0x10, 0x0C, 0x03, 0x00, 0x00},         // [28] 6x10 '<' 0x3C
            {0x00, 0x00, 0x00, 0x00, 0x1F, 0x00, 0x1F, 0x00, 0x00, 0x00},         // [29] 6x10 '=' 0x3D
            {0x00, 0x00, 0x00, 0x18, 0x06, 0x01, 0x06, 0x18, 0x00, 0x00},         // [30] 6x10 '>' 0x3E
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x06, 0x00, 0x04, 0x00, 0x00},         // [31] 6x10 '?' 0x3F
            {0x00, 0x00, 0x00, 0x1E, 0x01, 0x0D, 0x15, 0x0A, 0x00, 0x00},         // [32] 6x10 '@' 0x40
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [33] 6x10 'A' 0x41
            {0x00, 0x00, 0x00, 0x1E, 0x11, 0x1E, 0x11, 0x0E, 0x00, 0x00},         // [34] 6x10 'B' 0x42
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x10, 0x11, 0x0E, 0x00, 0x00},         // [35] 6x10 'C' 0x43
            {0x00, 0x00, 0x00, 0x1E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [36] 6x10 'D' 0x44
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x1C, 0x11, 0x0E, 0x00, 0x00},         // [37] 6x10 'E' 0x45
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x1C, 0x10, 0x10, 0x00, 0x00},         // [38] 6x10 'F' 0x46
            {0x00, 0x00, 0x00, 0x0E, 0x10, 0x17, 0x11, 0x0E, 0x00, 0x00},         // [39] 6x10 'G' 0x47
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [40] 6x10 'H' 0x48
            {0x00, 0x00, 0x00, 0x1F, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [41] 6x10 'I' 0x49
            {0x00, 0x00, 0x00, 0x03, 0x01, 0x01, 0x11, 0x0E, 0x00, 0x00},         // [42] 6x10 'J' 0x4A
            {0x00, 0x00, 0x00, 0x11, 0x12, 0x1C, 0x12, 0x11, 0x00, 0x00},         // [43] 6x10 'K' 0x4B
            {0x00, 0x00, 0x00, 0x10, 0x10, 0x10, 0x11, 0x0E, 0x00, 0x00},         // [44] 6x10 'L' 0x4C
            {0x00, 0x00, 0x00, 0x11, 0x1B, 0x15, 0x11, 0x11, 0x00, 0x00},         // [45] 6x10 'M' 0x4D
            {0x00, 0x00, 0x00, 0x11, 0x19, 0x15, 0x13, 0x11, 0x00, 0x00},         // [46] 6x10 'N' 0x4E
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [47] 6x10 'O' 0x4F
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x1E, 0x10, 0x10, 0x00, 0x00},         // [48] 6x10 'P' 0x50
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x11, 0x15, 0x0E, 0x04, 0x00},         // [49] 6x10 'Q' 0x51
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x1E, 0x12, 0x11, 0x00, 0x00},         // [50] 6x10 'R' 0x52
            {0x00, 0x00, 0x00, 0x0E, 0x10, 0x0E, 0x01, 0x0E, 0x00, 0x00},         // [51] 6x10 'S' 0x53
            {0x00, 0x00, 0x00, 0x1F, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00},         // [52] 6x10 'T' 0x54
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [53] 6x10 'U' 0x55
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x0A, 0x0A, 0x04, 0x00, 0x00},         // [54] 6x10 'V' 0x56
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x15, 0x1B, 0x11, 0x00, 0x00},         // [55] 6x10 'W' 0x57
            {0x00, 0x00, 0x00, 0x11, 0x0A, 0x04, 0x0A, 0x11, 0x00, 0x00},         // [56] 6x10 'X' 0x58
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x0A, 0x04, 0x04, 0x00, 0x00},         // [57] 6x10 'Y' 0x59
            {0x00, 0x00, 0x00, 0x1F, 0x02, 0x04, 0x08, 0x1F, 0x00, 0x00},         // [58] 6x10 'Z' 0x5A
            {0x00, 0x00, 0x0C, 0x08, 0x08, 0x08, 0x08, 0x08, 0x0C, 0x00},         // [59] 6x10 '[' 0x5B
            {0x00, 0x00, 0x10, 0x08, 0x04, 0x04, 0x04, 0x02, 0x01, 0x00},         // [60] 6x10 '\' 0x5C
            {0x00, 0x00, 0x06, 0x02, 0x02, 0x02, 0x02, 0x02, 0x06, 0x00},         // [61] 6x10 ']' 0x5D
            {0x04, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [62] 6x10 '^' 0x5E
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x1F},         // [63] 6x10 '_' 0x5F
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [64] 1x10 '`' 0x60
            {0x00, 0x00, 0x00, 0x0E, 0x01, 0x0F, 0x11, 0x0F, 0x00, 0x00},         // [65] 6x10 'a' 0x61
            {0x00, 0x30, 0x30, 0x3E, 0x33, 0x33, 0x33, 0x1E, 0x00, 0x00},         // [66] 6x10 'b' 0x62
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x10, 0x11, 0x0E, 0x00, 0x00},         // [67] 6x10 'c' 0x63
            {0x00, 0x01, 0x01, 0x0F, 0x11, 0x11, 0x11, 0x1E, 0x00, 0x00},         // [68] 6x10 'd' 0x64
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x1F, 0x10, 0x0E, 0x00, 0x00},         // [69] 6x10 'e' 0x65
            {0x00, 0x06, 0x09, 0x08, 0x1E, 0x08, 0x08, 0x08, 0x00, 0x00},         // [70] 6x10 'f' 0x66
            {0x00, 0x00, 0x00, 0x0F, 0x11, 0x11, 0x0F, 0x01, 0x01, 0x0E},         // [71] 6x10 'g' 0x67
            {0x00, 0x10, 0x10, 0x1E, 0x11, 0x11, 0x11, 0x11, 0x00, 0x00},         // [72] 6x10 'h' 0x68
            {0x00, 0x04, 0x00, 0x1C, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [73] 6x10 'i' 0x69
            {0x00, 0x01, 0x00, 0x07, 0x01, 0x01, 0x01, 0x01, 0x11, 0x0E},         // [74] 6x10 'j' 0x6A
            {0x00, 0x10, 0x10, 0x11, 0x12, 0x1C, 0x12, 0x11, 0x00, 0x00},         // [75] 6x10 'k' 0x6B
            {0x00, 0x1C, 0x04, 0x04, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [76] 6x10 'l' 0x6C
            {0x00, 0x00, 0x00, 0x1F, 0x15, 0x15, 0x15, 0x15, 0x00, 0x00},         // [77] 6x10 'm' 0x6D
            {0x00, 0x00, 0x00, 0x16, 0x19, 0x11, 0x11, 0x11, 0x00, 0x00},         // [78] 6x10 'n' 0x6E
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [79] 6x10 'o' 0x6F
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x1E, 0x10, 0x10},         // [80] 6x10 'p' 0x70
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0F, 0x01, 0x01},         // [81] 6x10 'q' 0x71
            {0x00, 0x00, 0x00, 0x17, 0x19, 0x10, 0x10, 0x10, 0x00, 0x00},         // [82] 6x10 'r' 0x72
            {0x00, 0x00, 0x00, 0x0E, 0x10, 0x0E, 0x01, 0x0E, 0x00, 0x00},         // [83] 6x10 's' 0x73
            {0x00, 0x08, 0x08, 0x1C, 0x08, 0x08, 0x09, 0x06, 0x00, 0x00},         // [84] 6x10 't' 0x74
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0F, 0x00, 0x00},         // [85] 6x10 'u' 0x75
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x0A, 0x0A, 0x04, 0x00, 0x00},         // [86] 6x10 'v' 0x76
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x15, 0x15, 0x0A, 0x00, 0x00},         // [87] 6x10 'w' 0x77
            {0x00, 0x00, 0x00, 0x11, 0x0A, 0x04, 0x0A, 0x11, 0x00, 0x00},         // [88] 6x10 'x' 0x78
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x11, 0x0F, 0x01, 0x01, 0x0E},         // [89] 6x10 'y' 0x79
            {0x00, 0x00, 0x00, 0x1F, 0x02, 0x04, 0x08, 0x1F, 0x00, 0x00},         // [90] 6x10 'z' 0x7A
            {0x00, 0x00, 0x02, 0x04, 0x04, 0x08, 0x04, 0x04, 0x02, 0x00},         // [91] 6x10 '{' 0x7B
            {0x00, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00},         // [92] 6x10 '|' 0x7C
            {0x00, 0x00, 0x08, 0x04, 0x04, 0x02, 0x04, 0x04, 0x08, 0x00},         // [93] 6x10 '}' 0x7D
            {0x00, 0x00, 0x00, 0x00, 0x0D, 0x12, 0x00, 0x00, 0x00, 0x00},         // [94] 6x10 '~' 0x7E
            {0x00, 0x00, 0x00, 0x0C, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x00},         // [95] 6x10 '¡' 0xA1
            {0x00, 0x00, 0x04, 0x0F, 0x14, 0x14, 0x0F, 0x04, 0x04, 0x00},         // [96] 6x10 '¢' 0xA2
            {0x00, 0x00, 0x00, 0x06, 0x09, 0x1C, 0x08, 0x1F, 0x00, 0x00},         // [97] 6x10 '£' 0xA3
            {0x00, 0x00, 0x00, 0x06, 0x09, 0x1C, 0x09, 0x06, 0x00, 0x00},         // [98] 6x10 '¤' 0xA4
            {0x00, 0x00, 0x00, 0x11, 0x0A, 0x04, 0x0E, 0x04, 0x00, 0x00},         // [99] 6x10 '¥' 0xA5
            {0x00, 0x00, 0x04, 0x04, 0x04, 0x00, 0x04, 0x04, 0x04, 0x00},         // [100] 6x10 '¦' 0xA6
            {0x00, 0x00, 0x0E, 0x10, 0x0E, 0x11, 0x0E, 0x01, 0x0E, 0x00},         // [101] 6x10 '§' 0xA7
            {0x00, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [102] 6x10 '¨' 0xA8
            {0x00, 0x00, 0x00, 0x06, 0x08, 0x06, 0x00, 0x00, 0x00, 0x00},         // [103] 6x10 '©' 0xA9
            {0x00, 0x00, 0x00, 0x0E, 0x12, 0x0D, 0x00, 0x1F, 0x00, 0x00},         // [104] 6x10 'ª' 0xAA
            {0x00, 0x00, 0x00, 0x00, 0x09, 0x12, 0x09, 0x00, 0x00, 0x00},         // [105] 6x10 '«' 0xAB
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x1F, 0x01, 0x00, 0x00, 0x00},         // [106] 6x10 '¬' 0xAC
            {}, // blank font char '­' 0xAD
            {0x00, 0x00, 0x00, 0x06, 0x08, 0x08, 0x00, 0x00, 0x00, 0x00},         // [108] 6x10 '®' 0xAE
            {0x00, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [109] 6x10 '¯' 0xAF
            {0x00, 0x00, 0x00, 0x04, 0x0A, 0x04, 0x00, 0x00, 0x00, 0x00},         // [110] 6x10 '°' 0xB0
            {0x00, 0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x00, 0x0E, 0x00},         // [111] 6x10 '±' 0xB1
            {0x00, 0x03, 0x07, 0x03, 0x07, 0x00, 0x00, 0x00, 0x00, 0x00},         // [112] 3x10 '²' 0xB2
            {0x00, 0x07, 0x03, 0x03, 0x07, 0x00, 0x00, 0x00, 0x00, 0x00},         // [113] 3x10 '³' 0xB3
            {0x02, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},         // [114] 6x10 '´' 0xB4
            {0x00, 0x00, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0F, 0x10, 0x10},         // [115] 6x10 'µ' 0xB5
            {0x00, 0x00, 0x00, 0x0F, 0x1D, 0x0D, 0x05, 0x05, 0x00, 0x00},         // [116] 6x10 '¶' 0xB6
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00, 0x00},         // [117] 6x10 '·' 0xB7
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x08},         // [118] 6x10 '¸' 0xB8
            {0x00, 0x03, 0x03, 0x01, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00},         // [119] 3x10 '¹' 0xB9
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x0E, 0x00, 0x1F, 0x00, 0x00},         // [120] 6x10 'º' 0xBA
            {0x00, 0x00, 0x00, 0x00, 0x12, 0x09, 0x12, 0x00, 0x00, 0x00},         // [121] 6x10 '»' 0xBB
            {0x00, 0x30, 0x32, 0x16, 0x1F, 0x0B, 0x1F, 0x17, 0x00, 0x00},         // [122] 7x10 '¼' 0xBC
            {0x00, 0x30, 0x16, 0x14, 0x1B, 0x1F, 0x13, 0x37, 0x00, 0x00},         // [123] 7x10 '½' 0xBD
            {0x00, 0xF0, 0x76, 0xF4, 0x7A, 0x1E, 0x1F, 0x3F, 0x00, 0x00},         // [124] 8x10 '¾' 0xBE
            {0x00, 0x00, 0x00, 0x04, 0x00, 0x0C, 0x11, 0x0E, 0x00, 0x00},         // [125] 6x10 '¿' 0xBF
            {0x08, 0x04, 0x00, 0x0E, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [126] 6x10 'À' 0xC0
            {0x02, 0x04, 0x00, 0x0E, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [127] 6x10 'Á' 0xC1
            {0x04, 0x0A, 0x00, 0x0E, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [128] 6x10 'Â' 0xC2
            {0x0D, 0x12, 0x00, 0x0E, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [129] 6x10 'Ã' 0xC3
            {0x00, 0x0A, 0x00, 0x0E, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [130] 6x10 'Ä' 0xC4
            {0x04, 0x0A, 0x04, 0x0E, 0x11, 0x1F, 0x11, 0x11, 0x00, 0x00},         // [131] 6x10 'Å' 0xC5
            {0x00, 0x00, 0x00, 0x0F, 0x14, 0x17, 0x1C, 0x17, 0x00, 0x00},         // [132] 6x10 'Æ' 0xC6
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x10, 0x11, 0x0E, 0x04, 0x08},         // [133] 6x10 'Ç' 0xC7
            {0x08, 0x04, 0x00, 0x0E, 0x11, 0x1C, 0x11, 0x0E, 0x00, 0x00},         // [134] 6x10 'È' 0xC8
            {0x02, 0x04, 0x00, 0x0E, 0x11, 0x1C, 0x11, 0x0E, 0x00, 0x00},         // [135] 6x10 'É' 0xC9
            {0x04, 0x0A, 0x00, 0x0E, 0x11, 0x1C, 0x11, 0x0E, 0x00, 0x00},         // [136] 6x10 'Ê' 0xCA
            {0x00, 0x0A, 0x00, 0x0E, 0x11, 0x1C, 0x11, 0x0E, 0x00, 0x00},         // [137] 6x10 'Ë' 0xCB
            {0x08, 0x04, 0x00, 0x1F, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [138] 6x10 'Ì' 0xCC
            {0x02, 0x04, 0x00, 0x1F, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [139] 6x10 'Í' 0xCD
            {0x04, 0x0A, 0x00, 0x1F, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [140] 6x10 'Î' 0xCE
            {0x00, 0x0A, 0x00, 0x1F, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [141] 6x10 'Ï' 0xCF
            {0x00, 0x00, 0x00, 0x1E, 0x11, 0x19, 0x11, 0x0E, 0x00, 0x00},         // [142] 6x10 'Ð' 0xD0
            {0x0D, 0x12, 0x00, 0x11, 0x19, 0x15, 0x13, 0x11, 0x00, 0x00},         // [143] 6x10 'Ñ' 0xD1
            {0x08, 0x04, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [144] 6x10 'Ò' 0xD2
            {0x02, 0x04, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [145] 6x10 'Ó' 0xD3
            {0x04, 0x0A, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [146] 6x10 'Ô' 0xD4
            {0x0D, 0x12, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [147] 6x10 'Õ' 0xD5
            {0x00, 0x0A, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [148] 6x10 'Ö' 0xD6
            {0x00, 0x00, 0x00, 0x11, 0x0A, 0x04, 0x0A, 0x11, 0x00, 0x00},         // [149] 6x10 '×' 0xD7
            {0x00, 0x00, 0x00, 0x0E, 0x13, 0x15, 0x19, 0x0E, 0x00, 0x00},         // [150] 6x10 'Ø' 0xD8
            {0x08, 0x04, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [151] 6x10 'Ù' 0xD9
            {0x02, 0x04, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [152] 6x10 'Ú' 0xDA
            {0x04, 0x0A, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [153] 6x10 'Û' 0xDB
            {0x00, 0x0A, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [154] 6x10 'Ü' 0xDC
            {0x02, 0x04, 0x00, 0x11, 0x11, 0x0A, 0x04, 0x04, 0x00, 0x00},         // [155] 6x10 'Ý' 0xDD
            {0x00, 0x00, 0x00, 0x10, 0x1E, 0x11, 0x1E, 0x10, 0x00, 0x00},         // [156] 6x10 'Þ' 0xDE
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x1E, 0x11, 0x16, 0x10, 0x00},         // [157] 6x10 'ß' 0xDF
            {0x08, 0x04, 0x00, 0x0E, 0x01, 0x0F, 0x11, 0x0F, 0x00, 0x00},         // [158] 6x10 'à' 0xE0
            {0x02, 0x04, 0x00, 0x0E, 0x01, 0x0F, 0x11, 0x0F, 0x00, 0x00},         // [159] 6x10 'á' 0xE1
            {0x04, 0x0A, 0x00, 0x0E, 0x01, 0x0F, 0x11, 0x0F, 0x00, 0x00},         // [160] 6x10 'â' 0xE2
            {0x0D, 0x12, 0x00, 0x0E, 0x01, 0x0F, 0x11, 0x0F, 0x00, 0x00},         // [161] 6x10 'ã' 0xE3
            {0x00, 0x0A, 0x00, 0x0E, 0x01, 0x0F, 0x11, 0x0F, 0x00, 0x00},         // [162] 6x10 'ä' 0xE4
            {0x04, 0x0A, 0x04, 0x0E, 0x01, 0x0F, 0x11, 0x0F, 0x00, 0x00},         // [163] 6x10 'å' 0xE5
            {0x00, 0x00, 0x00, 0x0E, 0x05, 0x0E, 0x14, 0x0B, 0x00, 0x00},         // [164] 6x10 'æ' 0xE6
            {0x00, 0x00, 0x00, 0x0E, 0x11, 0x10, 0x11, 0x0E, 0x04, 0x08},         // [165] 6x10 'ç' 0xE7
            {0x08, 0x04, 0x00, 0x0E, 0x11, 0x1F, 0x10, 0x0E, 0x00, 0x00},         // [166] 6x10 'è' 0xE8
            {0x02, 0x04, 0x00, 0x0E, 0x11, 0x1F, 0x10, 0x0E, 0x00, 0x00},         // [167] 6x10 'é' 0xE9
            {0x04, 0x0A, 0x00, 0x0E, 0x11, 0x1F, 0x10, 0x0E, 0x00, 0x00},         // [168] 6x10 'ê' 0xEA
            {0x00, 0x0A, 0x00, 0x0E, 0x11, 0x1F, 0x10, 0x0E, 0x00, 0x00},         // [169] 6x10 'ë' 0xEB
            {0x08, 0x04, 0x00, 0x1C, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [170] 6x10 'ì' 0xEC
            {0x02, 0x04, 0x00, 0x1C, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [171] 6x10 'í' 0xED
            {0x04, 0x0A, 0x00, 0x1C, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [172] 6x10 'î' 0xEE
            {0x00, 0x0A, 0x00, 0x1C, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [173] 6x10 'ï' 0xEF
            {0x00, 0x0D, 0x02, 0x05, 0x01, 0x0F, 0x11, 0x0E, 0x00, 0x00},         // [174] 6x10 'ð' 0xF0
            {0x0D, 0x12, 0x00, 0x16, 0x19, 0x11, 0x11, 0x11, 0x00, 0x00},         // [175] 6x10 'ñ' 0xF1
            {0x08, 0x04, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [176] 6x10 'ò' 0xF2
            {0x02, 0x04, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [177] 6x10 'ó' 0xF3
            {0x04, 0x0A, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [178] 6x10 'ô' 0xF4
            {0x0D, 0x12, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [179] 6x10 'õ' 0xF5
            {0x00, 0x0A, 0x00, 0x0E, 0x11, 0x11, 0x11, 0x0E, 0x00, 0x00},         // [180] 6x10 'ö' 0xF6
            {0x00, 0x00, 0x00, 0x04, 0x00, 0x1F, 0x00, 0x04, 0x00, 0x00},         // [181] 6x10 '÷' 0xF7
            {0x00, 0x00, 0x00, 0x0E, 0x13, 0x15, 0x19, 0x0E, 0x00, 0x00},         // [182] 6x10 'ø' 0xF8
            {0x08, 0x04, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0F, 0x00, 0x00},         // [183] 6x10 'ù' 0xF9
            {0x02, 0x04, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0F, 0x00, 0x00},         // [184] 6x10 'ú' 0xFA
            {0x04, 0x0A, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0F, 0x00, 0x00},         // [185] 6x10 'û' 0xFB
            {0x00, 0x0A, 0x00, 0x11, 0x11, 0x11, 0x11, 0x0F, 0x00, 0x00},         // [186] 6x10 'ü' 0xFC
            {0x02, 0x04, 0x00, 0x11, 0x11, 0x11, 0x0F, 0x01, 0x01, 0x0E},         // [187] 6x10 'ý' 0xFD
            {0x00, 0x10, 0x10, 0x1E, 0x11, 0x11, 0x11, 0x1E, 0x10, 0x10},         // [188] 6x10 'þ' 0xFE
            {0x00, 0x0A, 0x00, 0x11, 0x11, 0x11, 0x0F, 0x01, 0x01, 0x0E},         // [189] 6x10 'ÿ' 0xFF
            {0x0F, 0x06, 0x0E, 0x0E, 0x1B, 0x1F, 0x1F, 0x31, 0x00, 0x00},         // [190] 6x10 'Ā' 0x100
            {0x00, 0x0F, 0x00, 0x0F, 0x09, 0x0F, 0x19, 0x0F, 0x04, 0x00},         // [191] 5x10 'ā' 0x101
            {0x0E, 0x06, 0x0E, 0x0E, 0x1B, 0x1F, 0x1F, 0x31, 0x00, 0x00},         // [192] 6x10 'Ă' 0x102
            {0x00, 0x0F, 0x00, 0x0F, 0x09, 0x0F, 0x19, 0x0F, 0x04, 0x00},         // [193] 5x10 'ă' 0x103
            {0x00, 0x06, 0x0E, 0x0E, 0x1B, 0x1F, 0x1F, 0x31, 0x01, 0x01},         // [194] 6x10 'Ą' 0x104
            {0x00, 0x00, 0x00, 0x0F, 0x09, 0x0F, 0x19, 0x0F, 0x07, 0x03},         // [195] 5x10 'ą' 0x105
            {0x04, 0x0F, 0x1B, 0x11, 0x10, 0x10, 0x19, 0x1F, 0x06, 0x00},         // [196] 6x10 'Ć' 0x106
            {0x00, 0x06, 0x00, 0x0F, 0x09, 0x18, 0x19, 0x0F, 0x06, 0x00},         // [197] 5x10 'ć' 0x107
            {0x0F, 0x0F, 0x1B, 0x11, 0x10, 0x10, 0x19, 0x1F, 0x06, 0x00},         // [198] 6x10 'Ĉ' 0x108
            {0x04, 0x0E, 0x00, 0x0F, 0x09, 0x18, 0x19, 0x0F, 0x06, 0x00},         // [199] 5x10 'ĉ' 0x109
            {0x04, 0x0F, 0x1B, 0x11, 0x10, 0x10, 0x19, 0x1F, 0x06, 0x00},         // [200] 6x10 'Ċ' 0x10A
            {0x00, 0x06, 0x00, 0x0F, 0x09, 0x18, 0x19, 0x0F, 0x06, 0x00},         // [201] 5x10 'ċ' 0x10B
            {0x06, 0x0F, 0x1B, 0x11, 0x10, 0x10, 0x19, 0x1F, 0x06, 0x00},         // [202] 6x10 'Č' 0x10C
            {0x09, 0x07, 0x00, 0x0F, 0x09, 0x18, 0x19, 0x0F, 0x06, 0x00},         // [203] 5x10 'č' 0x10D
            {0x0C, 0x1E, 0x13, 0x11, 0x11, 0x11, 0x13, 0x1F, 0x00, 0x00},         // [204] 6x10 'Ď' 0x10E
            {0x00, 0x03, 0x03, 0x1F, 0x33, 0x33, 0x33, 0x1F, 0x0C, 0x00},         // [205] 6x10 'ď' 0x10F
            {0x00, 0x1E, 0x1B, 0x19, 0x3D, 0x19, 0x1B, 0x1F, 0x00, 0x00},         // [206] 6x10 'Đ' 0x110
            {0x00, 0x07, 0x07, 0x1F, 0x33, 0x33, 0x33, 0x1F, 0x0C, 0x00},         // [207] 6x10 'đ' 0x111
            {0x0F, 0x0F, 0x08, 0x08, 0x0F, 0x08, 0x08, 0x0F, 0x00, 0x00},         // [208] 5x10 'Ē' 0x112
            {0x00, 0x0F, 0x00, 0x0F, 0x09, 0x1F, 0x18, 0x0F, 0x06, 0x00},         // [209] 5x10 'ē' 0x113
            {0x07, 0x0F, 0x08, 0x08, 0x0F, 0x08, 0x08, 0x0F, 0x00, 0x00},         // [210] 5x10 'Ĕ' 0x114
            {0x00, 0x0F, 0x00, 0x0F, 0x09, 0x1F, 0x18, 0x0F, 0x06, 0x00},         // [211] 5x10 'ĕ' 0x115
            {0x02, 0x0F, 0x08, 0x08, 0x0F, 0x08, 0x08, 0x0F, 0x00, 0x00},         // [212] 5x10 'Ė' 0x116
            {0x00, 0x06, 0x00, 0x0F, 0x09, 0x1F, 0x18, 0x0F, 0x06, 0x00},         // [213] 5x10 'ė' 0x117
            {0x00, 0x0F, 0x08, 0x08, 0x0F, 0x08, 0x08, 0x0F, 0x03, 0x03},         // [214] 5x10 'Ę' 0x118
            {0x00, 0x00, 0x00, 0x0F, 0x09, 0x1F, 0x18, 0x0F, 0x06, 0x07},         // [215] 5x10 'ę' 0x119
            {0x03, 0x0F, 0x08, 0x08, 0x0F, 0x08, 0x08, 0x0F, 0x00, 0x00},         // [216] 5x10 'Ě' 0x11A
            {0x09, 0x07, 0x00, 0x0F, 0x09, 0x1F, 0x18, 0x0F, 0x06, 0x00},         // [217] 5x10 'ě' 0x11B
            {0x1E, 0x1E, 0x37, 0x23, 0x2F, 0x2F, 0x33, 0x3F, 0x0C, 0x00},         // [218] 7x10 'Ĝ' 0x11C
            {0x02, 0x07, 0x00, 0x0F, 0x09, 0x19, 0x19, 0x0F, 0x07, 0x0F},         // [219] 5x10 'ĝ' 0x11D
            {0x1C, 0x1E, 0x37, 0x23, 0x2F, 0x2F, 0x33, 0x3F, 0x0C, 0x00},         // [220] 7x10 'Ğ' 0x11E
            {0x00, 0x0F, 0x00, 0x0F, 0x09, 0x19, 0x19, 0x0F, 0x07, 0x0F},         // [221] 5x10 'ğ' 0x11F
            {0x08, 0x1E, 0x37, 0x23, 0x2F, 0x2F, 0x33, 0x3F, 0x0C, 0x00},         // [222] 7x10 'Ġ' 0x120
            {0x00, 0x06, 0x00, 0x0F, 0x09, 0x19, 0x19, 0x0F, 0x07, 0x0F},         // [223] 5x10 'ġ' 0x121
            {0x00, 0x1E, 0x37, 0x23, 0x2F, 0x2F, 0x33, 0x3F, 0x0C, 0x0C},         // [224] 7x10 'Ģ' 0x122
            {0x06, 0x06, 0x00, 0x0F, 0x09, 0x19, 0x19, 0x0F, 0x07, 0x0F},         // [225] 5x10 'ģ' 0x123
            {0x1E, 0x23, 0x23, 0x23, 0x3F, 0x23, 0x23, 0x23, 0x00, 0x00},         // [226] 7x10 'Ĥ' 0x124
            {0x0F, 0x08, 0x08, 0x0F, 0x09, 0x09, 0x09, 0x09, 0x00, 0x00},         // [227] 5x10 'ĥ' 0x125
            {0x00, 0x23, 0x7F, 0x23, 0x3F, 0x23, 0x23, 0x23, 0x00, 0x00},         // [228] 7x10 'Ħ' 0x126
            {0x00, 0x1E, 0x1E, 0x0F, 0x0D, 0x09, 0x09, 0x09, 0x00, 0x00},         // [229] 5x10 'ħ' 0x127
            {0x07, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00, 0x00},         // [230] 3x10 'Ĩ' 0x128
            {0x00, 0x03, 0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x00, 0x00},         // [231] 2x10 'ĩ' 0x129
            {0x07, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00, 0x00},         // [232] 3x10 'Ī' 0x12A
            {0x00, 0x03, 0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x00, 0x00},         // [233] 2x10 'ī' 0x12B
            {0x07, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00, 0x00},         // [234] 3x10 'Ĭ' 0x12C
            {0x00, 0x03, 0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x00, 0x00},         // [235] 2x10 'ĭ' 0x12D
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x06, 0x06},         // [236] 3x10 'Į' 0x12E
            {0x00, 0x01, 0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x03, 0x03},         // [237] 2x10 'į' 0x12F
            {0x02, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00, 0x00},         // [238] 3x10 'İ' 0x130
            {0x00, 0x00, 0x00, 0x1C, 0x04, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [239] 6x10 'ı' 0x131
            {0x00, 0x61, 0x61, 0x61, 0x61, 0x61, 0x79, 0x7F, 0x06, 0x00},         // [240] 8x10 'Ĳ' 0x132
            {0x00, 0x0B, 0x00, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x03, 0x07},         // [241] 5x10 'ĳ' 0x133
            {0x03, 0x01, 0x01, 0x01, 0x01, 0x01, 0x19, 0x1F, 0x06, 0x00},         // [242] 5x10 'Ĵ' 0x134
            {0x01, 0x03, 0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x03},         // [243] 2x10 'ĵ' 0x135
            {0x00, 0x13, 0x17, 0x16, 0x1C, 0x1E, 0x13, 0x13, 0x04, 0x04},         // [244] 6x10 'Ķ' 0x136
            {0x00, 0x08, 0x08, 0x0B, 0x0E, 0x0E, 0x0F, 0x0B, 0x06, 0x06},         // [245] 5x10 'ķ' 0x137
            {0x00, 0x00, 0x00, 0x0B, 0x0B, 0x0E, 0x0B, 0x0B, 0x00, 0x00},         // [246] 5x10 'ĸ' 0x138
            {0x08, 0x08, 0x08, 0x08, 0x08, 0x08, 0x08, 0x0F, 0x00, 0x00},         // [247] 5x10 'Ĺ' 0x139
            {0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x00, 0x00},         // [248] 2x10 'ĺ' 0x13A
            {0x00, 0x08, 0x08, 0x08, 0x08, 0x08, 0x08, 0x0F, 0x02, 0x02},         // [249] 5x10 'Ļ' 0x13B
            {0x00, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01, 0x01},         // [250] 2x10 'ļ' 0x13C
            {0x00, 0x0B, 0x0A, 0x08, 0x08, 0x08, 0x08, 0x0F, 0x00, 0x00},         // [251] 5x10 'Ľ' 0x13D
            {0x00, 0x02, 0x03, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00},         // [252] 3x10 'ľ' 0x13E
            {0x00, 0x08, 0x08, 0x0A, 0x0A, 0x08, 0x08, 0x0F, 0x00, 0x00},         // [253] 5x10 'Ŀ' 0x13F
            {0x00, 0x02, 0x02, 0x02, 0x03, 0x02, 0x02, 0x02, 0x00, 0x00},         // [254] 3x10 'ŀ' 0x140
            {0x00, 0x00, 0x00, 0x08, 0x0C, 0x18, 0x09, 0x0E, 0x00, 0x00},         // [255] 6x10 'Ł' 0x141
            {0x00, 0x1C, 0x04, 0x06, 0x0C, 0x04, 0x04, 0x1F, 0x00, 0x00},         // [256] 6x10 'ł' 0x142
            {0x0C, 0x33, 0x33, 0x3B, 0x2F, 0x2F, 0x27, 0x23, 0x00, 0x00},         // [257] 7x10 'Ń' 0x143
            {0x00, 0x06, 0x00, 0x0F, 0x09, 0x09, 0x09, 0x09, 0x00, 0x00},         // [258] 5x10 'ń' 0x144
            {0x00, 0x33, 0x33, 0x3B, 0x2F, 0x2F, 0x27, 0x23, 0x00, 0x0C},         // [259] 7x10 'Ņ' 0x145
            {0x00, 0x00, 0x00, 0x0F, 0x09, 0x09, 0x09, 0x09, 0x06, 0x06},         // [260] 5x10 'ņ' 0x146
            {0x0C, 0x33, 0x33, 0x3B, 0x2F, 0x2F, 0x27, 0x23, 0x00, 0x00},         // [261] 7x10 'Ň' 0x147
            {0x09, 0x07, 0x00, 0x0F, 0x09, 0x09, 0x09, 0x09, 0x00, 0x00},         // [262] 5x10 'ň' 0x148
            {0x00, 0x10, 0x10, 0x0F, 0x09, 0x09, 0x09, 0x09, 0x00, 0x00},         // [263] 5x10 'ŉ' 0x149
            {0x00, 0x33, 0x33, 0x3B, 0x2F, 0x2F, 0x27, 0x27, 0x03, 0x07},         // [264] 7x10 'Ŋ' 0x14A
            {0x00, 0x00, 0x00, 0x0F, 0x09, 0x09, 0x09, 0x09, 0x01, 0x03},         // [265] 5x10 'ŋ' 0x14B
            {0x1E, 0x1E, 0x37, 0x23, 0x23, 0x23, 0x33, 0x3E, 0x0C, 0x00},         // [266] 7x10 'Ō' 0x14C
            {0x00, 0x0F, 0x00, 0x0F, 0x09, 0x19, 0x19, 0x0F, 0x06, 0x00},         // [267] 5x10 'ō' 0x14D
            {0x1C, 0x1E, 0x37, 0x23, 0x23, 0x23, 0x33, 0x3E, 0x0C, 0x00},         // [268] 7x10 'Ŏ' 0x14E
            {0x00, 0x0F, 0x00, 0x0F, 0x09, 0x19, 0x19, 0x0F, 0x06, 0x00},         // [269] 5x10 'ŏ' 0x14F
            {0x1C, 0x1E, 0x37, 0x23, 0x23, 0x23, 0x33, 0x3E, 0x0C, 0x00},         // [270] 7x10 'Ő' 0x150
            {0x00, 0x07, 0x00, 0x0F, 0x09, 0x19, 0x19, 0x0F, 0x06, 0x00},         // [271] 5x10 'ő' 0x151
            {0x00, 0x00, 0x00, 0x0F, 0x14, 0x17, 0x14, 0x0F, 0x00, 0x00},         // [272] 6x10 'Œ' 0x152
            {0x00, 0x00, 0x00, 0x0E, 0x15, 0x16, 0x14, 0x0B, 0x00, 0x00},         // [273] 6x10 'œ' 0x153
            {0x04, 0x1F, 0x13, 0x11, 0x1F, 0x1E, 0x13, 0x13, 0x00, 0x00},         // [274] 6x10 'Ŕ' 0x154
            {0x00, 0x01, 0x00, 0x03, 0x03, 0x02, 0x02, 0x02, 0x00, 0x00},         // [275] 3x10 'ŕ' 0x155
            {0x00, 0x1F, 0x13, 0x11, 0x1F, 0x1E, 0x13, 0x13, 0x04, 0x04},         // [276] 6x10 'Ŗ' 0x156
            {0x00, 0x00, 0x00, 0x03, 0x03, 0x02, 0x02, 0x02, 0x02, 0x02},         // [277] 3x10 'ŗ' 0x157
            {0x0C, 0x1F, 0x13, 0x11, 0x1F, 0x1E, 0x13, 0x13, 0x00, 0x00},         // [278] 6x10 'Ř' 0x158
            {0x04, 0x03, 0x00, 0x03, 0x03, 0x02, 0x02, 0x02, 0x00, 0x00},         // [279] 3x10 'ř' 0x159
            {0x04, 0x1F, 0x1B, 0x18, 0x1E, 0x07, 0x33, 0x1F, 0x0C, 0x00},         // [280] 6x10 'Ś' 0x15A
            {0x00, 0x06, 0x00, 0x0F, 0x0B, 0x0F, 0x1B, 0x0F, 0x06, 0x00},         // [281] 5x10 'ś' 0x15B
            {0x1E, 0x1F, 0x1B, 0x18, 0x1E, 0x07, 0x33, 0x1F, 0x0C, 0x00},         // [282] 6x10 'Ŝ' 0x15C
            {0x02, 0x07, 0x00, 0x0F, 0x0B, 0x0F, 0x1B, 0x0F, 0x06, 0x00},         // [283] 5x10 'ŝ' 0x15D
            {0x00, 0x1F, 0x1B, 0x18, 0x1E, 0x07, 0x33, 0x1F, 0x0C, 0x06},         // [284] 6x10 'Ş' 0x15E
            {0x00, 0x00, 0x00, 0x0F, 0x0B, 0x0F, 0x1B, 0x0F, 0x06, 0x06},         // [285] 5x10 'ş' 0x15F
            {0x0A, 0x04, 0x00, 0x0E, 0x10, 0x0E, 0x01, 0x0E, 0x00, 0x00},         // [286] 6x10 'Š' 0x160
            {0x0A, 0x04, 0x00, 0x0E, 0x10, 0x0E, 0x01, 0x0E, 0x00, 0x00},         // [287] 6x10 'š' 0x161
            {0x00, 0x3F, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x04, 0x06},         // [288] 6x10 'Ţ' 0x162
            {0x00, 0x03, 0x03, 0x07, 0x03, 0x03, 0x03, 0x03, 0x01, 0x01},         // [289] 3x10 'ţ' 0x163
            {0x06, 0x3F, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x00, 0x00},         // [290] 6x10 'Ť' 0x164
            {0x00, 0x03, 0x03, 0x07, 0x03, 0x03, 0x03, 0x03, 0x01, 0x00},         // [291] 3x10 'ť' 0x165
            {0x00, 0x3F, 0x0C, 0x1E, 0x1E, 0x0C, 0x0C, 0x0C, 0x00, 0x00},         // [292] 6x10 'Ŧ' 0x166
            {0x00, 0x03, 0x03, 0x07, 0x07, 0x07, 0x03, 0x03, 0x01, 0x00},         // [293] 3x10 'ŧ' 0x167
            {0x0E, 0x11, 0x11, 0x11, 0x11, 0x11, 0x19, 0x1F, 0x04, 0x00},         // [294] 6x10 'Ũ' 0x168
            {0x00, 0x0F, 0x00, 0x09, 0x09, 0x09, 0x09, 0x0F, 0x04, 0x00},         // [295] 5x10 'ũ' 0x169
            {0x0F, 0x11, 0x11, 0x11, 0x11, 0x11, 0x19, 0x1F, 0x04, 0x00},         // [296] 6x10 'Ū' 0x16A
            {0x00, 0x0F, 0x00, 0x09, 0x09, 0x09, 0x09, 0x0F, 0x04, 0x00},         // [297] 5x10 'ū' 0x16B
            {0x0E, 0x11, 0x11, 0x11, 0x11, 0x11, 0x19, 0x1F, 0x04, 0x00},         // [298] 6x10 'Ŭ' 0x16C
            {0x00, 0x0F, 0x00, 0x09, 0x09, 0x09, 0x09, 0x0F, 0x04, 0x00},         // [299] 5x10 'ŭ' 0x16D
            {0x0C, 0x11, 0x11, 0x11, 0x11, 0x11, 0x19, 0x1F, 0x04, 0x00},         // [300] 6x10 'Ů' 0x16E
            {0x06, 0x06, 0x00, 0x09, 0x09, 0x09, 0x09, 0x0F, 0x04, 0x00},         // [301] 5x10 'ů' 0x16F
            {0x0E, 0x11, 0x11, 0x11, 0x11, 0x11, 0x19, 0x1F, 0x04, 0x00},         // [302] 6x10 'Ű' 0x170
            {0x00, 0x07, 0x00, 0x09, 0x09, 0x09, 0x09, 0x0F, 0x04, 0x00},         // [303] 5x10 'ű' 0x171
            {0x00, 0x11, 0x11, 0x11, 0x11, 0x11, 0x19, 0x1F, 0x06, 0x06},         // [304] 6x10 'Ų' 0x172
            {0x00, 0x00, 0x00, 0x09, 0x09, 0x09, 0x09, 0x0F, 0x07, 0x03},         // [305] 5x10 'ų' 0x173
            {0x3C, 0x19B, 0x9B, 0xBB, 0xFA, 0xEE, 0xEE, 0x66, 0x00, 0x00},        // [306] 9x10 'Ŵ' 0x174
            {0x04, 0x0E, 0x00, 0x6D, 0x2D, 0x3F, 0x3F, 0x33, 0x00, 0x00},         // [307] 7x10 'ŵ' 0x175
            {0x1E, 0x33, 0x1B, 0x1E, 0x0E, 0x0C, 0x0C, 0x0C, 0x00, 0x00},         // [308] 6x10 'Ŷ' 0x176
            {0x04, 0x0E, 0x00, 0x1B, 0x0B, 0x0E, 0x0E, 0x06, 0x04, 0x1C},         // [309] 5x10 'ŷ' 0x177
            {0x00, 0x0A, 0x00, 0x11, 0x11, 0x0A, 0x04, 0x04, 0x00, 0x00},         // [310] 6x10 'Ÿ' 0x178
            {0x04, 0x3F, 0x03, 0x06, 0x0C, 0x0C, 0x18, 0x3F, 0x00, 0x00},         // [311] 6x10 'Ź' 0x179
            {0x00, 0x06, 0x00, 0x1F, 0x07, 0x06, 0x0C, 0x1F, 0x00, 0x00},         // [312] 5x10 'ź' 0x17A
            {0x04, 0x3F, 0x03, 0x06, 0x0C, 0x0C, 0x18, 0x3F, 0x00, 0x00},         // [313] 6x10 'Ż' 0x17B
            {0x00, 0x06, 0x00, 0x1F, 0x07, 0x06, 0x0C, 0x1F, 0x00, 0x00},         // [314] 5x10 'ż' 0x17C
            {0x0A, 0x04, 0x00, 0x1F, 0x02, 0x04, 0x08, 0x1F, 0x00, 0x00},         // [315] 6x10 'Ž' 0x17D
            {0x0A, 0x04, 0x00, 0x1F, 0x02, 0x04, 0x08, 0x1F, 0x00, 0x00}           // [316] 6x10 'ž' 0x17E
    };
    private static final int[] widths = {
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // ' '..')' 0x20
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // '*'..'3' 0x2A
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // '4'..'=' 0x34
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // '>'..'G' 0x3E
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'H'..'Q' 0x48
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'R'..'[' 0x52
            6, 6, 6, 6, 1, 6, 6, 6, 6, 6,           // '\'..'e' 0x5C
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'f'..'o' 0x66
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'p'..'y' 0x70
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'z'..'¥' 0x7A
            6, 6, 6, 6, 6, 6, 6, 0, 6, 6,           // '¦'..'¯' 0xA6
            6, 6, 3, 3, 6, 6, 6, 6, 6, 3,           // '°'..'¹' 0xB0
            6, 6, 7, 7, 8, 6, 6, 6, 6, 6,           // 'º'..'Ã' 0xBA
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'Ä'..'Í' 0xC4
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'Î'..'×' 0xCE
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'Ø'..'á' 0xD8
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'â'..'ë' 0xE2
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'ì'..'õ' 0xEC
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'ö'..'ÿ' 0xF6
            6, 5, 6, 5, 6, 5, 6, 5, 6, 5,           // 'Ā'..'ĉ' 0x100
            6, 5, 6, 5, 6, 6, 6, 6, 5, 5,           // 'Ċ'..'ē' 0x10A
            5, 5, 5, 5, 5, 5, 5, 5, 7, 5,           // 'Ĕ'..'ĝ' 0x114
            7, 5, 7, 5, 7, 5, 7, 5, 7, 5,           // 'Ğ'..'ħ' 0x11E
            3, 2, 3, 2, 3, 2, 3, 2, 3, 6,           // 'Ĩ'..'ı' 0x128
            8, 5, 5, 2, 6, 5, 5, 5, 2, 5,           // 'Ĳ'..'Ļ' 0x132
            2, 5, 3, 5, 3, 6, 6, 7, 5, 7,           // 'ļ'..'Ņ' 0x13C
            5, 7, 5, 5, 7, 5, 7, 5, 7, 5,           // 'ņ'..'ŏ' 0x146
            7, 5, 6, 6, 6, 3, 6, 3, 6, 3,           // 'Ő'..'ř' 0x150
            6, 5, 6, 5, 6, 5, 6, 6, 6, 3,           // 'Ś'..'ţ' 0x15A
            6, 3, 6, 3, 6, 5, 6, 5, 6, 5,           // 'Ť'..'ŭ' 0x164
            6, 5, 6, 5, 6, 5, 9, 7, 6, 5,           // 'Ů'..'ŷ' 0x16E
            6, 6, 5, 6, 5, 6, 6                  //    ..'ž'
    };

    public static final FontItem FONT = new FontItem(
            "ROOT_SQUARE_20PX",
            charsPixels,
            widths
    );
}

// Max Bitmap 9 x 10
// Mass Matrix #.#.#.#.# 0
// Mass Matrix ......... 1
// Mass Matrix #.#.#.#.# 2
// Mass Matrix ......... 3
// Mass Matrix #.#.#.#.# 4
// Mass Matrix ......... 5
// Mass Matrix #.#.#.#.# 6
// Mass Matrix ......... 7
// Mass Matrix #.#.#.#.# 8
// Mass Matrix ......... 9
