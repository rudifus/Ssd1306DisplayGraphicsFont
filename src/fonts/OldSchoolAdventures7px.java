package fonts;

public class OldSchoolAdventures7px {
    private static final int[][] charsPixels = {
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [0] 2x8 ' ' 0x20
            {0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x02, 0x00},                     // [1] 3x8 '!' 0x21
            {0x0A, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [2] 4x8 '"' 0x22
            {0x28, 0x28, 0xFE, 0x28, 0xFE, 0x28, 0x28, 0x00},                     // [3] 8x8 '#' 0x23
            {0x10, 0x7E, 0x90, 0x7C, 0x12, 0xFC, 0x10, 0x00},                     // [4] 8x8 '$' 0x24
            {0x42, 0xA4, 0x48, 0x10, 0x24, 0x4A, 0x84, 0x00},                     // [5] 8x8 '%' 0x25
            {0x60, 0x92, 0x94, 0x78, 0x88, 0x8C, 0x72, 0x00},                     // [6] 8x8 '&' 0x26
            {0x02, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [7] 2x8 ''' 0x27
            {0x06, 0x08, 0x10, 0x10, 0x10, 0x08, 0x06, 0x00},                     // [8] 5x8 '(' 0x28
            {0x18, 0x04, 0x02, 0x02, 0x02, 0x04, 0x18, 0x00},                     // [9] 5x8 ')' 0x29
            {0x08, 0x08, 0x3E, 0x08, 0x14, 0x22, 0x00, 0x00},                     // [10] 6x8 '*' 0x2A
            {0x00, 0x08, 0x08, 0x3E, 0x08, 0x08, 0x00, 0x00},                     // [11] 6x8 '+' 0x2B
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x02},                     // [12] 3x8 ',' 0x2C
            {0x00, 0x00, 0x00, 0x3E, 0x00, 0x00, 0x00, 0x00},                     // [13] 6x8 '-' 0x2D
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x00},                     // [14] 3x8 '.' 0x2E
            {0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x00},                     // [15] 8x8 '/' 0x2F
            {0x18, 0x24, 0x42, 0x42, 0x42, 0x24, 0x18, 0x00},                     // [16] 7x8 '0' 0x30
            {0x06, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00},                     // [17] 3x8 '1' 0x31
            {0x1C, 0x22, 0x02, 0x04, 0x18, 0x20, 0x3E, 0x00},                     // [18] 6x8 '2' 0x32
            {0x1C, 0x22, 0x02, 0x0C, 0x02, 0x22, 0x1C, 0x00},                     // [19] 6x8 '3' 0x33
            {0x0C, 0x14, 0x24, 0x44, 0x7E, 0x04, 0x04, 0x00},                     // [20] 7x8 '4' 0x34
            {0x3E, 0x20, 0x3C, 0x02, 0x02, 0x22, 0x1C, 0x00},                     // [21] 6x8 '5' 0x35
            {0x1C, 0x22, 0x20, 0x3C, 0x22, 0x22, 0x1C, 0x00},                     // [22] 6x8 '6' 0x36
            {0x3E, 0x02, 0x04, 0x04, 0x08, 0x08, 0x10, 0x00},                     // [23] 6x8 '7' 0x37
            {0x1C, 0x22, 0x22, 0x1C, 0x22, 0x22, 0x1C, 0x00},                     // [24] 6x8 '8' 0x38
            {0x1C, 0x22, 0x22, 0x1E, 0x02, 0x02, 0x02, 0x00},                     // [25] 6x8 '9' 0x39
            {0x00, 0x06, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00},                     // [26] 3x8 ':' 0x3A
            {0x00, 0x06, 0x00, 0x00, 0x00, 0x06, 0x02, 0x00},                     // [27] 3x8 ';' 0x3B
            {0x06, 0x18, 0x60, 0x80, 0x60, 0x18, 0x06, 0x00},                     // [28] 8x8 '<' 0x3C
            {0x00, 0x00, 0x3E, 0x00, 0x3E, 0x00, 0x00, 0x00},                     // [29] 6x8 '=' 0x3D
            {0xC0, 0x30, 0x0C, 0x02, 0x0C, 0x30, 0xC0, 0x00},                     // [30] 8x8 '>' 0x3E
            {0x7C, 0x82, 0x02, 0x1C, 0x20, 0x00, 0x20, 0x00},                     // [31] 8x8 '?' 0x3F
            {0x38, 0x44, 0x9A, 0xAA, 0xBC, 0x40, 0x30, 0x00},                     // [32] 8x8 '@' 0x40
            {0x10, 0x28, 0x28, 0x44, 0x7C, 0x82, 0x82, 0x00},                     // [33] 8x8 'A' 0x41
            {0xF0, 0x88, 0x88, 0xFC, 0x82, 0x82, 0xFC, 0x00},                     // [34] 8x8 'B' 0x42
            {0x3C, 0x42, 0x80, 0x80, 0x80, 0x42, 0x3C, 0x00},                     // [35] 8x8 'C' 0x43
            {0xF8, 0x84, 0x82, 0x82, 0x82, 0x84, 0xF8, 0x00},                     // [36] 8x8 'D' 0x44
            {0xFE, 0x80, 0x80, 0xF0, 0x80, 0x80, 0xFE, 0x00},                     // [37] 8x8 'E' 0x45
            {0xFE, 0x80, 0x80, 0xF0, 0x80, 0x80, 0x80, 0x00},                     // [38] 8x8 'F' 0x46
            {0x3C, 0x42, 0x80, 0x8E, 0x82, 0x42, 0x3C, 0x00},                     // [39] 8x8 'G' 0x47
            {0x82, 0x82, 0x82, 0xFE, 0x82, 0x82, 0x82, 0x00},                     // [40] 8x8 'H' 0x48
            {0x3E, 0x08, 0x08, 0x08, 0x08, 0x08, 0x3E, 0x00},                     // [41] 6x8 'I' 0x49
            {0xFE, 0x10, 0x10, 0x10, 0x10, 0x90, 0x60, 0x00},                     // [42] 8x8 'J' 0x4A
            {0x82, 0x84, 0x88, 0xF0, 0x88, 0x84, 0x82, 0x00},                     // [43] 8x8 'K' 0x4B
            {0x80, 0x80, 0x80, 0x80, 0x80, 0x80, 0xFE, 0x00},                     // [44] 8x8 'L' 0x4C
            {0x82, 0xC6, 0xAA, 0x92, 0x82, 0x82, 0x82, 0x00},                     // [45] 8x8 'M' 0x4D
            {0x82, 0xC2, 0xA2, 0x92, 0x8A, 0x86, 0x82, 0x00},                     // [46] 8x8 'N' 0x4E
            {0x38, 0x44, 0x82, 0x82, 0x82, 0x44, 0x38, 0x00},                     // [47] 8x8 'O' 0x4F
            {0xFC, 0x82, 0x82, 0x82, 0xFC, 0x80, 0x80, 0x00},                     // [48] 8x8 'P' 0x50
            {0x38, 0x44, 0x82, 0x82, 0x8A, 0x44, 0x3A, 0x00},                     // [49] 8x8 'Q' 0x51
            {0xFC, 0x82, 0x82, 0xFC, 0x88, 0x84, 0x82, 0x00},                     // [50] 8x8 'R' 0x52
            {0x7C, 0x82, 0x80, 0x7C, 0x02, 0x82, 0x7C, 0x00},                     // [51] 8x8 'S' 0x53
            {0xFE, 0x10, 0x10, 0x10, 0x10, 0x10, 0x10, 0x00},                     // [52] 8x8 'T' 0x54
            {0x82, 0x82, 0x82, 0x82, 0x82, 0x44, 0x38, 0x00},                     // [53] 8x8 'U' 0x55
            {0x82, 0x82, 0x44, 0x44, 0x28, 0x28, 0x10, 0x00},                     // [54] 8x8 'V' 0x56
            {0x82, 0x82, 0x82, 0x92, 0xAA, 0xC6, 0x82, 0x00},                     // [55] 8x8 'W' 0x57
            {0x82, 0x44, 0x28, 0x10, 0x28, 0x44, 0x82, 0x00},                     // [56] 8x8 'X' 0x58
            {0x82, 0x44, 0x28, 0x10, 0x10, 0x10, 0x10, 0x00},                     // [57] 8x8 'Y' 0x59
            {0xFE, 0x04, 0x08, 0x10, 0x20, 0x40, 0xFE, 0x00},                     // [58] 8x8 'Z' 0x5A
            {0x0E, 0x08, 0x08, 0x08, 0x08, 0x08, 0x0E, 0x00},                     // [59] 4x8 '[' 0x5B
            {0x80, 0x40, 0x20, 0x10, 0x08, 0x04, 0x02, 0x00},                     // [60] 8x8 '\' 0x5C
            {0x0E, 0x02, 0x02, 0x02, 0x02, 0x02, 0x0E, 0x00},                     // [61] 4x8 ']' 0x5D
            {0x10, 0x28, 0x44, 0x82, 0x82, 0x00, 0x00, 0x00},                     // [62] 8x8 '^' 0x5E
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFE, 0x00},                     // [63] 8x8 '_' 0x5F
            {0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [64] 1x8 '`' 0x60
            {0x00, 0x00, 0x1C, 0x24, 0x24, 0x24, 0x1E, 0x00},                     // [65] 6x8 'a' 0x61
            {0x20, 0x20, 0x20, 0x3C, 0x22, 0x22, 0x3C, 0x00},                     // [66] 6x8 'b' 0x62
            {0x00, 0x00, 0x1C, 0x22, 0x20, 0x22, 0x1C, 0x00},                     // [67] 6x8 'c' 0x63
            {0x02, 0x02, 0x02, 0x1E, 0x22, 0x22, 0x1E, 0x00},                     // [68] 6x8 'd' 0x64
            {0x00, 0x00, 0x1C, 0x22, 0x3E, 0x20, 0x1E, 0x00},                     // [69] 6x8 'e' 0x65
            {0x1C, 0x22, 0x20, 0x38, 0x20, 0x20, 0x20, 0x00},                     // [70] 6x8 'f' 0x66
            {0x00, 0x00, 0x1E, 0x22, 0x3E, 0x02, 0x3C, 0x00},                     // [71] 6x8 'g' 0x67
            {0x20, 0x20, 0x20, 0x3C, 0x22, 0x22, 0x22, 0x00},                     // [72] 6x8 'h' 0x68
            {0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x00},                     // [73] 2x8 'i' 0x69
            {0x00, 0x02, 0x00, 0x02, 0x02, 0x22, 0x1C, 0x00},                     // [74] 6x8 'j' 0x6A
            {0x20, 0x20, 0x22, 0x24, 0x38, 0x24, 0x22, 0x00},                     // [75] 6x8 'k' 0x6B
            {0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00},                     // [76] 2x8 'l' 0x6C
            {0x00, 0x00, 0x36, 0x2A, 0x2A, 0x2A, 0x22, 0x00},                     // [77] 6x8 'm' 0x6D
            {0x00, 0x00, 0x3C, 0x22, 0x22, 0x22, 0x22, 0x00},                     // [78] 6x8 'n' 0x6E
            {0x00, 0x00, 0x1C, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [79] 6x8 'o' 0x6F
            {0x00, 0x00, 0x3C, 0x22, 0x22, 0x3C, 0x20, 0x00},                     // [80] 6x8 'p' 0x70
            {0x00, 0x00, 0x1E, 0x22, 0x22, 0x1E, 0x02, 0x00},                     // [81] 6x8 'q' 0x71
            {0x00, 0x00, 0x2C, 0x32, 0x20, 0x20, 0x20, 0x00},                     // [82] 6x8 'r' 0x72
            {0x00, 0x00, 0x1E, 0x20, 0x1C, 0x02, 0x3C, 0x00},                     // [83] 6x8 's' 0x73
            {0x20, 0x20, 0x20, 0x38, 0x20, 0x22, 0x1C, 0x00},                     // [84] 6x8 't' 0x74
            {0x00, 0x00, 0x22, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [85] 6x8 'u' 0x75
            {0x00, 0x00, 0x22, 0x22, 0x14, 0x14, 0x08, 0x00},                     // [86] 6x8 'v' 0x76
            {0x00, 0x00, 0x22, 0x22, 0x22, 0x2A, 0x36, 0x00},                     // [87] 6x8 'w' 0x77
            {0x00, 0x00, 0x22, 0x14, 0x08, 0x14, 0x22, 0x00},                     // [88] 6x8 'x' 0x78
            {0x00, 0x00, 0x22, 0x22, 0x1E, 0x02, 0x3C, 0x00},                     // [89] 6x8 'y' 0x79
            {0x00, 0x00, 0x3E, 0x04, 0x08, 0x10, 0x3E, 0x00},                     // [90] 6x8 'z' 0x7A
            {0x06, 0x08, 0x08, 0x10, 0x08, 0x08, 0x06, 0x00},                     // [91] 5x8 '{' 0x7B
            {0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00},                     // [92] 2x8 '|' 0x7C
            {0x18, 0x04, 0x04, 0x02, 0x04, 0x04, 0x18, 0x00},                     // [93] 5x8 '}' 0x7D
            {0x00, 0x00, 0x62, 0x92, 0x8C, 0x00, 0x00, 0x00},                     // [94] 8x8 '~' 0x7E
            {0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00},                     // [95] 3x8 '¡' 0xA1
            {0x08, 0x1C, 0x2A, 0x28, 0x2A, 0x1C, 0x08, 0x00},                     // [96] 6x8 '¢' 0xA2
            {0x1C, 0x22, 0x10, 0x38, 0x10, 0x20, 0x3E, 0x00},                     // [97] 6x8 '£' 0xA3
            {0x00, 0x22, 0x1C, 0x14, 0x1C, 0x22, 0x00, 0x00},                     // [98] 7x8 '¤' 0xA4
            {0x82, 0x44, 0x28, 0x10, 0x38, 0x10, 0x38, 0x00},                     // [99] 8x8 '¥' 0xA5
            {0x02, 0x02, 0x02, 0x00, 0x02, 0x02, 0x02, 0x00},                     // [100] 2x8 '¦' 0xA6
            {0x7C, 0x82, 0xF8, 0x44, 0x3E, 0x82, 0x7C, 0x00},                     // [101] 8x8 '§' 0xA7
            {0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [102] 4x8 '¨' 0xA8
            {0x38, 0x44, 0xBA, 0xA2, 0xBA, 0x44, 0x38, 0x00},                     // [103] 8x8 '©' 0xA9
            {0x1C, 0x04, 0x1C, 0x1E, 0x00, 0x00, 0x00, 0x00},                     // [104] 5x8 'ª' 0xAA
            {0x00, 0x00, 0x12, 0x24, 0x48, 0x24, 0x12, 0x00},                     // [105] 7x8 '«' 0xAB
            {0x00, 0x00, 0x00, 0x3E, 0x02, 0x00, 0x00, 0x00},                     // [106] 6x8 '¬' 0xAC
            {}, // blank font char '­' 0xAD
            {0x38, 0x44, 0xBA, 0xB2, 0xAA, 0x44, 0x38, 0x00},                     // [108] 8x8 '®' 0xAE
            {0x3E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [109] 6x8 '¯' 0xAF
            {0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [110] 4x8 '°' 0xB0
            {0x00, 0x08, 0x08, 0x3E, 0x08, 0x3E, 0x00, 0x00},                     // [111] 6x8 '±' 0xB1
            {0x0E, 0x02, 0x04, 0x0E, 0x00, 0x00, 0x00, 0x00},                     // [112] 4x8 '²' 0xB2
            {0x0C, 0x02, 0x0E, 0x02, 0x0C, 0x00, 0x00, 0x00},                     // [113] 4x8 '³' 0xB3
            {0x02, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},                     // [114] 4x8 '´' 0xB4
            {0x24, 0x24, 0x24, 0x24, 0x3E, 0x20, 0x20, 0x00},                     // [115] 6x8 'µ' 0xB5
            {0x1A, 0x3A, 0x3A, 0x3A, 0x1A, 0x0A, 0x0A, 0x00},                     // [116] 6x8 '¶' 0xB6
            {0x00, 0x00, 0x00, 0x06, 0x06, 0x00, 0x00, 0x00},                     // [117] 3x8 '·' 0xB7
            {0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x04, 0x00},                     // [118] 5x8 '¸' 0xB8
            {0x06, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00},                     // [119] 3x8 '¹' 0xB9
            {0x0C, 0x12, 0x12, 0x0C, 0x00, 0x00, 0x00, 0x00},                     // [120] 5x8 'º' 0xBA
            {0x00, 0x00, 0x48, 0x24, 0x12, 0x24, 0x48, 0x00},                     // [121] 7x8 '»' 0xBB
            {0xC2, 0x44, 0x48, 0x10, 0x2A, 0x4E, 0x82, 0x00},                     // [122] 8x8 '¼' 0xBC
            {0xC2, 0x44, 0x48, 0x16, 0x22, 0x44, 0x86, 0x00},                     // [123] 8x8 '½' 0xBD
            {0xC2, 0x44, 0xC8, 0x50, 0xEA, 0x4E, 0x82, 0x00},                     // [124] 8x8 '¾' 0xBE
            {0x08, 0x00, 0x08, 0x70, 0x80, 0x82, 0x7C, 0x00},                     // [125] 8x8 '¿' 0xBF
            {0x20, 0x10, 0x10, 0x28, 0x44, 0x7C, 0x82, 0x00},                     // [126] 8x8 'À' 0xC0
            {0x08, 0x10, 0x10, 0x28, 0x44, 0x7C, 0x82, 0x00},                     // [127] 8x8 'Á' 0xC1
            {0x10, 0x28, 0x10, 0x28, 0x44, 0x7C, 0x82, 0x00},                     // [128] 8x8 'Â' 0xC2
            {0x24, 0x58, 0x10, 0x28, 0x44, 0x7C, 0x82, 0x00},                     // [129] 8x8 'Ã' 0xC3
            {0x28, 0x00, 0x10, 0x28, 0x44, 0x7C, 0x82, 0x00},                     // [130] 8x8 'Ä' 0xC4
            {0x38, 0x28, 0x10, 0x28, 0x44, 0x7C, 0x82, 0x00},                     // [131] 8x8 'Å' 0xC5
            {0x1E, 0x28, 0x28, 0x4E, 0x78, 0x88, 0x8E, 0x00},                     // [132] 8x8 'Æ' 0xC6
            {0x3C, 0x42, 0x80, 0x42, 0x3C, 0x08, 0x10, 0x00},                     // [133] 8x8 'Ç' 0xC7
            {0x20, 0x10, 0xFE, 0x80, 0xF8, 0x80, 0xFE, 0x00},                     // [134] 8x8 'È' 0xC8
            {0x08, 0x10, 0xFE, 0x80, 0xF8, 0x80, 0xFE, 0x00},                     // [135] 8x8 'É' 0xC9
            {0x10, 0x28, 0xFE, 0x80, 0xF8, 0x80, 0xFE, 0x00},                     // [136] 8x8 'Ê' 0xCA
            {0x28, 0x00, 0xFE, 0x80, 0xF8, 0x80, 0xFE, 0x00},                     // [137] 8x8 'Ë' 0xCB
            {0x10, 0x08, 0x3E, 0x08, 0x08, 0x08, 0x3E, 0x00},                     // [138] 6x8 'Ì' 0xCC
            {0x04, 0x08, 0x3E, 0x08, 0x08, 0x08, 0x3E, 0x00},                     // [139] 6x8 'Í' 0xCD
            {0x08, 0x14, 0x3E, 0x08, 0x08, 0x08, 0x3E, 0x00},                     // [140] 6x8 'Î' 0xCE
            {0x14, 0x00, 0x3E, 0x08, 0x08, 0x08, 0x3E, 0x00},                     // [141] 6x8 'Ï' 0xCF
            {0x78, 0x44, 0x42, 0xF2, 0x42, 0x44, 0x78, 0x00},                     // [142] 8x8 'Ð' 0xD0
            {0x24, 0x58, 0xC2, 0xA2, 0x92, 0x8A, 0x86, 0x00},                     // [143] 8x8 'Ñ' 0xD1
            {0x20, 0x10, 0x7C, 0x82, 0x82, 0x82, 0x7C, 0x00},                     // [144] 8x8 'Ò' 0xD2
            {0x08, 0x10, 0x7C, 0x82, 0x82, 0x82, 0x7C, 0x00},                     // [145] 8x8 'Ó' 0xD3
            {0x10, 0x28, 0x7C, 0x82, 0x82, 0x82, 0x7C, 0x00},                     // [146] 8x8 'Ô' 0xD4
            {0x24, 0x58, 0x7C, 0x82, 0x82, 0x82, 0x7C, 0x00},                     // [147] 8x8 'Õ' 0xD5
            {0x28, 0x00, 0x7C, 0x82, 0x82, 0x82, 0x7C, 0x00},                     // [148] 8x8 'Ö' 0xD6
            {0x00, 0x22, 0x14, 0x08, 0x14, 0x22, 0x00, 0x00},                     // [149] 6x8 '×' 0xD7
            {0x3A, 0x44, 0x8A, 0x92, 0xA2, 0x44, 0xB8, 0x00},                     // [150] 8x8 'Ø' 0xD8
            {0x20, 0x10, 0x82, 0x82, 0x82, 0x44, 0x38, 0x00},                     // [151] 8x8 'Ù' 0xD9
            {0x08, 0x10, 0x82, 0x82, 0x82, 0x44, 0x38, 0x00},                     // [152] 8x8 'Ú' 0xDA
            {0x10, 0x28, 0x82, 0x82, 0x82, 0x44, 0x38, 0x00},                     // [153] 8x8 'Û' 0xDB
            {0x28, 0x00, 0x82, 0x82, 0x82, 0x44, 0x38, 0x00},                     // [154] 8x8 'Ü' 0xDC
            {0x08, 0x10, 0x82, 0x44, 0x28, 0x10, 0x10, 0x00},                     // [155] 8x8 'Ý' 0xDD
            {0x20, 0x3C, 0x22, 0x22, 0x22, 0x3C, 0x20, 0x00},                     // [156] 6x8 'Þ' 0xDE
            {0xF0, 0x88, 0x88, 0x9C, 0x82, 0xA2, 0x9C, 0x00},                     // [157] 8x8 'ß' 0xDF
            {0x10, 0x08, 0x1C, 0x24, 0x24, 0x24, 0x1E, 0x00},                     // [158] 6x8 'à' 0xE0
            {0x04, 0x08, 0x1C, 0x24, 0x24, 0x24, 0x1E, 0x00},                     // [159] 6x8 'á' 0xE1
            {0x08, 0x14, 0x1C, 0x24, 0x24, 0x24, 0x1E, 0x00},                     // [160] 6x8 'â' 0xE2
            {0x12, 0x2C, 0x1C, 0x24, 0x24, 0x24, 0x1E, 0x00},                     // [161] 6x8 'ã' 0xE3
            {0x14, 0x00, 0x1C, 0x24, 0x24, 0x24, 0x1E, 0x00},                     // [162] 6x8 'ä' 0xE4
            {0x1C, 0x14, 0x1C, 0x24, 0x24, 0x24, 0x1E, 0x00},                     // [163] 6x8 'å' 0xE5
            {0x00, 0x00, 0xEC, 0x12, 0x7E, 0x90, 0x7E, 0x00},                     // [164] 8x8 'æ' 0xE6
            {0x1C, 0x22, 0x20, 0x22, 0x1C, 0x04, 0x08, 0x00},                     // [165] 6x8 'ç' 0xE7
            {0x10, 0x08, 0x1C, 0x22, 0x3E, 0x20, 0x1E, 0x00},                     // [166] 6x8 'è' 0xE8
            {0x04, 0x08, 0x1C, 0x22, 0x3E, 0x20, 0x1E, 0x00},                     // [167] 6x8 'é' 0xE9
            {0x08, 0x14, 0x1C, 0x22, 0x3E, 0x20, 0x1E, 0x00},                     // [168] 6x8 'ê' 0xEA
            {0x14, 0x00, 0x1C, 0x22, 0x3E, 0x20, 0x1E, 0x00},                     // [169] 6x8 'ë' 0xEB
            {0x04, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x00},                     // [170] 3x8 'ì' 0xEC
            {0x02, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00},                     // [171] 4x8 'í' 0xED
            {0x04, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00},                     // [172] 4x8 'î' 0xEE
            {0x00, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00},                     // [173] 4x8 'ï' 0xEF
            {0x1A, 0x04, 0x0A, 0x1E, 0x22, 0x22, 0x1E, 0x00},                     // [174] 6x8 'ð' 0xF0
            {0x12, 0x2C, 0x3C, 0x22, 0x22, 0x22, 0x22, 0x00},                     // [175] 6x8 'ñ' 0xF1
            {0x10, 0x08, 0x1C, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [176] 6x8 'ò' 0xF2
            {0x04, 0x08, 0x1C, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [177] 6x8 'ó' 0xF3
            {0x08, 0x14, 0x1C, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [178] 6x8 'ô' 0xF4
            {0x12, 0x2C, 0x1C, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [179] 6x8 'õ' 0xF5
            {0x14, 0x00, 0x1C, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [180] 6x8 'ö' 0xF6
            {0x00, 0x08, 0x00, 0x3E, 0x00, 0x08, 0x00, 0x00},                     // [181] 6x8 '÷' 0xF7
            {0x02, 0x34, 0x48, 0x54, 0x24, 0x58, 0x80, 0x00},                     // [182] 8x8 'ø' 0xF8
            {0x10, 0x08, 0x22, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [183] 6x8 'ù' 0xF9
            {0x04, 0x08, 0x22, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [184] 6x8 'ú' 0xFA
            {0x08, 0x14, 0x22, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [185] 6x8 'û' 0xFB
            {0x14, 0x00, 0x22, 0x22, 0x22, 0x22, 0x1C, 0x00},                     // [186] 6x8 'ü' 0xFC
            {0x04, 0x08, 0x22, 0x22, 0x1E, 0x02, 0x3C, 0x00},                     // [187] 6x8 'ý' 0xFD
            {0x20, 0x20, 0x3C, 0x22, 0x3C, 0x20, 0x20, 0x00},                     // [188] 6x8 'þ' 0xFE
            {0x14, 0x00, 0x22, 0x22, 0x1E, 0x02, 0x3C, 0x00},                     // [189] 6x8 'ÿ' 0xFF
            {0x00, 0x0E, 0x0C, 0x0E, 0x1E, 0x1F, 0x1B, 0x00},                     // [190] 5x8 'Ā' 0x100
            {0x00, 0x00, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [191] 4x8 'ā' 0x101
            {0x0E, 0x0E, 0x0C, 0x0E, 0x1E, 0x1F, 0x1B, 0x00},                     // [192] 5x8 'Ă' 0x102
            {0x00, 0x07, 0x07, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [193] 4x8 'ă' 0x103
            {0x00, 0x00, 0x0C, 0x0E, 0x1E, 0x1F, 0x1B, 0x03},                     // [194] 5x8 'Ą' 0x104
            {0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x0F, 0x07},                     // [195] 4x8 'ą' 0x105
            {0x06, 0x06, 0x1F, 0x1B, 0x18, 0x1B, 0x1F, 0x04},                     // [196] 5x8 'Ć' 0x106
            {0x00, 0x06, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [197] 4x8 'ć' 0x107
            {0x04, 0x0E, 0x1F, 0x1B, 0x18, 0x1B, 0x1F, 0x04},                     // [198] 5x8 'Ĉ' 0x108
            {0x00, 0x04, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [199] 4x8 'ĉ' 0x109
            {0x00, 0x0C, 0x1F, 0x1B, 0x18, 0x1B, 0x1F, 0x04},                     // [200] 5x8 'Ċ' 0x10A
            {0x00, 0x00, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [201] 4x8 'ċ' 0x10B
            {0x0E, 0x0E, 0x1F, 0x1B, 0x18, 0x1B, 0x1F, 0x04},                     // [202] 5x8 'Č' 0x10C
            {0x00, 0x0E, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [203] 4x8 'č' 0x10D
            {0x0E, 0x0E, 0x1E, 0x1B, 0x1B, 0x1B, 0x1E, 0x00},                     // [204] 5x8 'Ď' 0x10E
            {0x00, 0x03, 0x03, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [205] 4x8 'ď' 0x10F
            {0x00, 0x00, 0x1E, 0x1B, 0x1F, 0x1B, 0x1E, 0x00},                     // [206] 5x8 'Đ' 0x110
            {0x00, 0x03, 0x07, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [207] 4x8 'đ' 0x111
            {0x00, 0x07, 0x0F, 0x0C, 0x0F, 0x0C, 0x0F, 0x00},                     // [208] 4x8 'Ē' 0x112
            {0x00, 0x00, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [209] 4x8 'ē' 0x113
            {0x07, 0x07, 0x0F, 0x0C, 0x0F, 0x0C, 0x0F, 0x00},                     // [210] 4x8 'Ĕ' 0x114
            {0x00, 0x0E, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [211] 4x8 'ĕ' 0x115
            {0x00, 0x06, 0x0F, 0x0C, 0x0F, 0x0C, 0x0F, 0x00},                     // [212] 4x8 'Ė' 0x116
            {0x00, 0x00, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [213] 4x8 'ė' 0x117
            {0x00, 0x00, 0x0F, 0x0C, 0x0F, 0x0C, 0x0F, 0x03},                     // [214] 4x8 'Ę' 0x118
            {0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [215] 4x8 'ę' 0x119
            {0x07, 0x07, 0x0F, 0x0C, 0x0F, 0x0C, 0x0F, 0x00},                     // [216] 4x8 'Ě' 0x11A
            {0x00, 0x0E, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [217] 4x8 'ě' 0x11B
            {0x04, 0x0E, 0x1F, 0x1B, 0x1F, 0x1F, 0x1F, 0x04},                     // [218] 5x8 'Ĝ' 0x11C
            {0x00, 0x04, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x0F},                     // [219] 4x8 'ĝ' 0x11D
            {0x0E, 0x0E, 0x1F, 0x1B, 0x1F, 0x1F, 0x1F, 0x04},                     // [220] 5x8 'Ğ' 0x11E
            {0x00, 0x0E, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x0F},                     // [221] 4x8 'ğ' 0x11F
            {0x00, 0x0C, 0x1F, 0x1B, 0x1F, 0x1F, 0x1F, 0x04},                     // [222] 5x8 'Ġ' 0x120
            {0x00, 0x00, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x0F},                     // [223] 4x8 'ġ' 0x121
            {0x00, 0x04, 0x1F, 0x1B, 0x1F, 0x1F, 0x1F, 0x06},                     // [224] 5x8 'Ģ' 0x122
            {0x00, 0x06, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x0F},                     // [225] 4x8 'ģ' 0x123
            {0x04, 0x0E, 0x1B, 0x1B, 0x1F, 0x1B, 0x1B, 0x00},                     // [226] 5x8 'Ĥ' 0x124
            {0x04, 0x0E, 0x0C, 0x0F, 0x0F, 0x0F, 0x0F, 0x00},                     // [227] 4x8 'ĥ' 0x125
            {0x00, 0x00, 0x1B, 0x1F, 0x1F, 0x1B, 0x1B, 0x00},                     // [228] 5x8 'Ħ' 0x126
            {0x00, 0x0C, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x00},                     // [229] 4x8 'ħ' 0x127
            {0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [230] 2x8 'Ĩ' 0x128
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [231] 2x8 'ĩ' 0x129
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [232] 2x8 'Ī' 0x12A
            {0x00, 0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [233] 2x8 'ī' 0x12B
            {0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [234] 2x8 'Ĭ' 0x12C
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [235] 2x8 'ĭ' 0x12D
            {0x00, 0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03},                     // [236] 2x8 'Į' 0x12E
            {0x00, 0x02, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03},                     // [237] 2x8 'į' 0x12F
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [238] 2x8 'İ' 0x130
            {0x00, 0x00, 0x00, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [239] 2x8 'ı' 0x131
            {0x00, 0x00, 0x33, 0x33, 0x33, 0x3B, 0x3F, 0x04},                     // [240] 6x8 'Ĳ' 0x132
            {0x00, 0x05, 0x07, 0x07, 0x07, 0x07, 0x07, 0x03},                     // [241] 3x8 'ĳ' 0x133
            {0x02, 0x07, 0x03, 0x03, 0x03, 0x0B, 0x0F, 0x04},                     // [242] 4x8 'Ĵ' 0x134
            {0x00, 0x02, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03},                     // [243] 2x8 'ĵ' 0x135
            {0x00, 0x00, 0x0F, 0x0F, 0x0E, 0x0F, 0x0F, 0x06},                     // [244] 4x8 'Ķ' 0x136
            {0x00, 0x0C, 0x0C, 0x0F, 0x0E, 0x0E, 0x0F, 0x06},                     // [245] 4x8 'ķ' 0x137
            {0x00, 0x00, 0x00, 0x0F, 0x0E, 0x0E, 0x0F, 0x00},                     // [246] 4x8 'ĸ' 0x138
            {0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0F, 0x00},                     // [247] 4x8 'Ĺ' 0x139
            {0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [248] 2x8 'ĺ' 0x13A
            {0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x0F, 0x06},                     // [249] 4x8 'Ļ' 0x13B
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03},                     // [250] 2x8 'ļ' 0x13C
            {0x00, 0x00, 0x0F, 0x0E, 0x0C, 0x0C, 0x0F, 0x00},                     // [251] 4x8 'Ľ' 0x13D
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [252] 2x8 'ľ' 0x13E
            {0x00, 0x00, 0x0C, 0x0C, 0x0F, 0x0C, 0x0F, 0x00},                     // [253] 4x8 'Ŀ' 0x13F
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [254] 2x8 'ŀ' 0x140
            {0x00, 0x00, 0x0C, 0x0E, 0x0E, 0x0C, 0x0F, 0x00},                     // [255] 4x8 'Ł' 0x141
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [256] 2x8 'ł' 0x142
            {0x06, 0x06, 0x1B, 0x1F, 0x1F, 0x1F, 0x1B, 0x00},                     // [257] 5x8 'Ń' 0x143
            {0x00, 0x06, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x00},                     // [258] 4x8 'ń' 0x144
            {0x00, 0x00, 0x1B, 0x1F, 0x1F, 0x1F, 0x1B, 0x06},                     // [259] 5x8 'Ņ' 0x145
            {0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [260] 4x8 'ņ' 0x146
            {0x0E, 0x0E, 0x1B, 0x1F, 0x1F, 0x1F, 0x1B, 0x00},                     // [261] 5x8 'Ň' 0x147
            {0x00, 0x0E, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x00},                     // [262] 4x8 'ň' 0x148
            {0x00, 0x00, 0x08, 0x0F, 0x0F, 0x0F, 0x0F, 0x00},                     // [263] 4x8 'ŉ' 0x149
            {0x00, 0x00, 0x1B, 0x1F, 0x1F, 0x1F, 0x1B, 0x07},                     // [264] 5x8 'Ŋ' 0x14A
            {0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x0F, 0x03},                     // [265] 4x8 'ŋ' 0x14B
            {0x00, 0x0E, 0x1F, 0x1B, 0x1B, 0x1B, 0x1F, 0x04},                     // [266] 5x8 'Ō' 0x14C
            {0x00, 0x00, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [267] 4x8 'ō' 0x14D
            {0x0E, 0x0E, 0x1F, 0x1B, 0x1B, 0x1B, 0x1F, 0x04},                     // [268] 5x8 'Ŏ' 0x14E
            {0x00, 0x07, 0x07, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [269] 4x8 'ŏ' 0x14F
            {0x0E, 0x0E, 0x1F, 0x1B, 0x1B, 0x1B, 0x1F, 0x04},                     // [270] 5x8 'Ő' 0x150
            {0x00, 0x07, 0x07, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [271] 4x8 'ő' 0x151
            {0x00, 0x10, 0x7F, 0x68, 0x4E, 0x68, 0x7F, 0x10},                     // [272] 7x8 'Œ' 0x152
            {0x00, 0x00, 0x00, 0x3F, 0x3F, 0x3F, 0x3F, 0x1A},                     // [273] 6x8 'œ' 0x153
            {0x06, 0x06, 0x0F, 0x0D, 0x0F, 0x0F, 0x0D, 0x00},                     // [274] 4x8 'Ŕ' 0x154
            {0x00, 0x01, 0x01, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [275] 2x8 'ŕ' 0x155
            {0x00, 0x00, 0x0F, 0x0D, 0x0F, 0x0F, 0x0D, 0x06},                     // [276] 4x8 'Ŗ' 0x156
            {0x00, 0x00, 0x00, 0x03, 0x03, 0x03, 0x03, 0x03},                     // [277] 2x8 'ŗ' 0x157
            {0x07, 0x07, 0x0F, 0x0D, 0x0F, 0x0F, 0x0D, 0x00},                     // [278] 4x8 'Ř' 0x158
            {0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x00},                     // [279] 2x8 'ř' 0x159
            {0x06, 0x06, 0x0F, 0x0D, 0x0F, 0x0B, 0x0F, 0x02},                     // [280] 4x8 'Ś' 0x15A
            {0x00, 0x06, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [281] 4x8 'ś' 0x15B
            {0x02, 0x07, 0x0F, 0x0D, 0x0F, 0x0B, 0x0F, 0x02},                     // [282] 4x8 'Ŝ' 0x15C
            {0x00, 0x04, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [283] 4x8 'ŝ' 0x15D
            {0x00, 0x02, 0x0F, 0x0D, 0x0F, 0x0B, 0x0F, 0x06},                     // [284] 4x8 'Ş' 0x15E
            {0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [285] 4x8 'ş' 0x15F
            {0x07, 0x07, 0x0F, 0x0D, 0x0F, 0x0B, 0x0F, 0x02},                     // [286] 4x8 'Š' 0x160
            {0x00, 0x0E, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x06},                     // [287] 4x8 'š' 0x161
            {0x00, 0x00, 0x0F, 0x06, 0x06, 0x06, 0x06, 0x06},                     // [288] 4x8 'Ţ' 0x162
            {0x00, 0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x01},                     // [289] 2x8 'ţ' 0x163
            {0x07, 0x07, 0x0F, 0x06, 0x06, 0x06, 0x06, 0x00},                     // [290] 4x8 'Ť' 0x164
            {0x00, 0x01, 0x03, 0x03, 0x03, 0x03, 0x03, 0x01},                     // [291] 2x8 'ť' 0x165
            {0x00, 0x00, 0x0F, 0x07, 0x07, 0x06, 0x06, 0x00},                     // [292] 4x8 'Ŧ' 0x166
            {0x00, 0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x01},                     // [293] 2x8 'ŧ' 0x167
            {0x06, 0x0E, 0x1B, 0x1B, 0x1B, 0x1B, 0x1E, 0x04},                     // [294] 5x8 'Ũ' 0x168
            {0x00, 0x06, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [295] 4x8 'ũ' 0x169
            {0x00, 0x0E, 0x1B, 0x1B, 0x1B, 0x1B, 0x1E, 0x04},                     // [296] 5x8 'Ū' 0x16A
            {0x00, 0x00, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [297] 4x8 'ū' 0x16B
            {0x0E, 0x0E, 0x1B, 0x1B, 0x1B, 0x1B, 0x1E, 0x04},                     // [298] 5x8 'Ŭ' 0x16C
            {0x00, 0x0E, 0x0E, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [299] 4x8 'ŭ' 0x16D
            {0x0C, 0x0C, 0x1B, 0x1B, 0x1B, 0x1B, 0x1E, 0x04},                     // [300] 5x8 'Ů' 0x16E
            {0x00, 0x06, 0x06, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [301] 4x8 'ů' 0x16F
            {0x0E, 0x0E, 0x1B, 0x1B, 0x1B, 0x1B, 0x1E, 0x04},                     // [302] 5x8 'Ű' 0x170
            {0x00, 0x07, 0x07, 0x0F, 0x0F, 0x0F, 0x0F, 0x04},                     // [303] 4x8 'ű' 0x171
            {0x00, 0x00, 0x1B, 0x1B, 0x1B, 0x1B, 0x1E, 0x06},                     // [304] 5x8 'Ų' 0x172
            {0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0F, 0x0F, 0x07},                     // [305] 4x8 'ų' 0x173
            {0x04, 0x0E, 0x3D, 0x3F, 0x3F, 0x3F, 0x1B, 0x00},                     // [306] 6x8 'Ŵ' 0x174
            {0x00, 0x04, 0x0E, 0x17, 0x1F, 0x1F, 0x1B, 0x00},                     // [307] 5x8 'ŵ' 0x175
            {0x02, 0x07, 0x0F, 0x0F, 0x06, 0x06, 0x06, 0x00},                     // [308] 4x8 'Ŷ' 0x176
            {0x00, 0x02, 0x07, 0x05, 0x07, 0x07, 0x03, 0x06},                     // [309] 3x8 'ŷ' 0x177
            {0x28, 0x00, 0x82, 0x44, 0x28, 0x10, 0x10, 0x00},                     // [310] 8x8 'Ÿ' 0x178
            {0x1E, 0x06, 0x7A, 0x8A, 0x88, 0x88, 0x70, 0x00},                     // [311] 8x8 'Ź' 0x179
            {0x1C, 0x22, 0x22, 0x1C, 0x08, 0x3E, 0x08, 0x00},                     // [312] 6x8 'ź' 0x17A
            {0x00, 0x06, 0x0F, 0x03, 0x06, 0x0E, 0x0F, 0x00},                     // [313] 4x8 'Ż' 0x17B
            {0x00, 0x00, 0x03, 0x07, 0x03, 0x07, 0x07, 0x00},                     // [314] 3x8 'ż' 0x17C
            {0x07, 0x07, 0x0F, 0x03, 0x06, 0x0E, 0x0F, 0x00},                     // [315] 4x8 'Ž' 0x17D
            {0x00, 0x07, 0x07, 0x07, 0x03, 0x07, 0x07, 0x00}                       // [316] 3x8 'ž' 0x17E
    };
    private static final int[] widths = {
            2, 3, 4, 8, 8, 8, 8, 2, 5, 5,           // ' '..')' 0x20
            6, 6, 3, 6, 3, 8, 7, 3, 6, 6,           // '*'..'3' 0x2A
            7, 6, 6, 6, 6, 6, 3, 3, 8, 6,           // '4'..'=' 0x34
            8, 8, 8, 8, 8, 8, 8, 8, 8, 8,           // '>'..'G' 0x3E
            8, 6, 8, 8, 8, 8, 8, 8, 8, 8,           // 'H'..'Q' 0x48
            8, 8, 8, 8, 8, 8, 8, 8, 8, 4,           // 'R'..'[' 0x52
            8, 4, 8, 8, 1, 6, 6, 6, 6, 6,           // '\'..'e' 0x5C
            6, 6, 6, 2, 6, 6, 2, 6, 6, 6,           // 'f'..'o' 0x66
            6, 6, 6, 6, 6, 6, 6, 6, 6, 6,           // 'p'..'y' 0x70
            6, 5, 2, 5, 8, 3, 6, 6, 7, 8,           // 'z'..'¥' 0x7A
            2, 8, 4, 8, 5, 7, 6, 1, 8, 6,           // '¦'..'¯' 0xA6
            4, 6, 4, 4, 4, 6, 6, 3, 5, 3,           // '°'..'¹' 0xB0
            5, 7, 8, 8, 8, 8, 8, 8, 8, 8,           // 'º'..'Ã' 0xBA
            8, 8, 8, 8, 8, 8, 8, 8, 6, 6,           // 'Ä'..'Í' 0xC4
            6, 6, 8, 8, 8, 8, 8, 8, 8, 6,           // 'Î'..'×' 0xCE
            8, 8, 8, 8, 8, 8, 6, 8, 6, 6,           // 'Ø'..'á' 0xD8
            6, 6, 6, 6, 8, 6, 6, 6, 6, 6,           // 'â'..'ë' 0xE2
            3, 4, 4, 4, 6, 6, 6, 6, 6, 6,           // 'ì'..'õ' 0xEC
            6, 6, 8, 6, 6, 6, 6, 6, 6, 6,           // 'ö'..'ÿ' 0xF6
            5, 4, 5, 4, 5, 4, 5, 4, 5, 4,           // 'Ā'..'ĉ' 0x100
            5, 4, 5, 4, 5, 4, 5, 4, 4, 4,           // 'Ċ'..'ē' 0x10A
            4, 4, 4, 4, 4, 4, 4, 4, 5, 4,           // 'Ĕ'..'ĝ' 0x114
            5, 4, 5, 4, 5, 4, 5, 4, 5, 4,           // 'Ğ'..'ħ' 0x11E
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2,           // 'Ĩ'..'ı' 0x128
            6, 3, 4, 2, 4, 4, 4, 4, 2, 4,           // 'Ĳ'..'Ļ' 0x132
            2, 4, 2, 4, 2, 4, 2, 5, 4, 5,           // 'ļ'..'Ņ' 0x13C
            4, 5, 4, 4, 5, 4, 5, 4, 5, 4,           // 'ņ'..'ŏ' 0x146
            5, 4, 7, 6, 4, 2, 4, 2, 4, 2,           // 'Ő'..'ř' 0x150
            4, 4, 4, 4, 4, 4, 4, 4, 4, 2,           // 'Ś'..'ţ' 0x15A
            4, 2, 4, 2, 5, 4, 5, 4, 5, 4,           // 'Ť'..'ŭ' 0x164
            5, 4, 5, 4, 5, 4, 6, 5, 4, 3,           // 'Ů'..'ŷ' 0x16E
            8, 8, 6, 4, 3, 4, 3                  //    ..'ž'
    };

    public static final FontItem FONT = new FontItem(
            "OLD_SCHOOL_ADVENTURES_7PX",
            charsPixels,
            widths
    );
}

