package pa2.utils;

public class BinaryUtils {

    public static long parseBinary(String num){
        long mod = 1;
        long total = 0;
        long temp;
        for(int i = 0; i < num.length();i++){
            temp = Integer.parseInt(num.substring(num.length()-i-1,num.length()-i));
            total += temp*mod;
            mod = mod*2;
        }
        return total;
    }
    public static byte parseBinaryByte(String num){
        int mod = 1;
        byte total = 0;
        int temp;
        for(int i = 0; i < num.length();i++){
            temp = Integer.parseInt(num.substring(num.length()-i-1,num.length()-i));
            total += temp*mod;
            mod = mod*2;
        }
        return total;
    }
}
