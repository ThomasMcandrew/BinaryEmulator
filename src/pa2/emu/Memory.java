package pa2.emu;

import pa2.utils.BinaryUtils;

public class Memory {

    private static byte[] memory;
    public static void init() {
    	memory = new byte[4096];
    }
    
    public static void store(long i, int adress) {
    	byte one = (byte) ((i >> 56) & 0xFF);
    	byte two = (byte) ((i >> 48) & 0xFF);
    	byte three = (byte) ((i >> 40) & 0xFF);
    	byte four = (byte) ((i >> 32) & 0xFF);
    	byte five = (byte) ((i >> 24) & 0xFF);
    	byte six = (byte) ((i >> 16) & 0xFF);
    	byte seven = (byte) ((i >> 8) & 0xFF);
    	byte eight = (byte) ((i >> 0) & 0xFF);
    	int start = adress/8;
    	memory[start] = one;
    	start++;
    	memory[start] = two;
    	start++;
    	memory[start] = three;
    	start++;
    	memory[start] = four;
    	start++;
    	memory[start] = five;
    	start++;
    	memory[start] = six;
    	start++;
    	memory[start] = seven;
    	start++;
    	memory[start] = eight;
    }
    public static long read(int adress) {
    	String num = "";
    	for(int i = adress/8;i < (adress/8)+8;i++) {
    		num += String.format("%8s", Integer.toBinaryString(memory[i] & 0xFF)).replace(' ', '0');
    	}
    	return BinaryUtils.parseBinary(num);
    	
    }
    public static void print() {
    	for(int i = 0; i < memory.length;i++) {
    		System.out.print(String.format("%8s", Integer.toBinaryString(memory[i] & 0xFF)).replace(' ', '0') + " ");
    		i++;
    		System.out.print(String.format("%8s", Integer.toBinaryString(memory[i] & 0xFF)).replace(' ', '0') + " ");
    		i++;
    		System.out.print(String.format("%8s", Integer.toBinaryString(memory[i] & 0xFF)).replace(' ', '0') + " ");
    		i++;
    		System.out.println(String.format("%8s", Integer.toBinaryString(memory[i] & 0xFF)).replace(' ', '0'));
    	}
    }
    
}
