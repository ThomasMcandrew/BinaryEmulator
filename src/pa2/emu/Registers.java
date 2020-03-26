package pa2.emu;

public class Registers {



    private static int X0;
    private static int X1;
    private static int X2;
    private static int X3;
    private static int X4;
    private static int X5;
    private static int X6;
    private static int X7;
    private static int X8;
    private static int X9;
    private static int X10;
    private static int X11;
    private static int X12;
    private static int X13;
    private static int X14;
    private static int X15;
    private static int X16;
    private static int X17;
    private static int X18;
    private static int X19;
    private static int X20;
    private static int X21;
    private static int X22;
    private static int X23;
    private static int X24;
    private static int X25;
    private static int X26;
    private static int X27;
    private static int X28;
    private static int X29;
    private static int X30;
    private static int X31 = 0;
    public static int get(int reg){
        switch (reg){
            case 0:
                return X0;
            case 1:
                return X1;
            case 2:
                return X2;
            case 3:
                return X3;
            case 4:
                return X4;
            case 5:
                return X5;
            case 6:
                return X6;
            case 7:
                return X7;
            case 8:
                return X8;
            case 9:
                return X9;
            case 10:
                return X10;
            case 11:
                return X11;
            case 12:
                return X12;
            case 13:
                return X13;
            case 14:
                return X14;
            case 15:
                return X15;
            case 16:
                return X16;
            case 17:
                return X17;
            case 18:
                return X18;
            case 19:
                return X19;
            case 20:
                return X20;
            case 21:
                return X21;
            case 22:
                return X22;
            case 23:
                return X23;
            case 24:
                return X24;
            case 25:
                return X25;
            case 26:
                return X26;
            case 27:
                return X27;
            case 28:
                return X28;
            case 29:
                return X29;
            case 30:
                return X30;
            case 31:
                return 0;
            default:
                break;
        }
        return 0;
    }
    public static void set(int reg, int val){
        switch (reg){
            case 0:
                X0 = val;
                break;
            case 1:
                X1 = val;
                break;
            case 2:
                X2 = val;
                break;
            case 3:
                X3 = val;
                break;
            case 4:
                X4 = val;
                break;
            case 5:
                X5 = val;
                break;
            case 6:
                X6 = val;
                break;
            case 7:
                X7 = val;
                break;
            case 8:
                X8 = val;
                break;
            case 9:
                X9 = val;
                break;
            case 10:
                X10 = val;
                break;
            case 11:
                X11 = val;
                break;
            case 12:
                X12 = val;
                break;
            case 13:
                X13 = val;
                break;
            case 14:
                X14 = val;
                break;
            case 15:
                X15 = val;
                break;
            case 16:
                X16 = val;
                break;
            case 17:
                X17 = val;
                break;
            case 18:
                X18 = val;
                break;
            case 19:
                X19 = val;
                break;
            case 20:
                X20 = val;
                break;
            case 21:
                X21 = val;
                break;
            case 22:
                X22 = val;
                break;
            case 23:
                X23 = val;
                break;
            case 24:
                X24 = val;
                break;
            case 25:
                X25 = val;
                break;
            case 26:
                X26 = val;
                break;
            case 27:
                X27 = val;
                break;
            case 28:
                X28 = val;
                break;
            case 29:
                X29 = val;
                break;
            case 30:
                X30 = val;
                break;
            default:
                break;
        }
    }





}
