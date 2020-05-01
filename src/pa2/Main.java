package pa2;

import pa2.emu.Memory;
import pa2.emu.Registers;
import pa2.emu.Stack;
import pa2.instruction.Instruction;
import pa2.utils.FileReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	public static int iterator;
	
    public static void main(String[] args) throws IOException {
        
    	Memory.init();
    	Stack.init();
    	Registers.set(28, 512L);
    	Registers.set(29, 512);
    	
        Scanner scan = new Scanner(System.in);
        String[] ins = null;

        while(ins == null) {
            System.out.print("1. Enter a file by path \n2. Select a file using file explorer\n");
            String input = scan.next();
            if(input.contains("1")) {
                System.out.println("Enter path.");
                try {
                    ins = FileReader.readFile(scan.next());
                }catch(FileNotFoundException e) {
                    System.out.println("File does not exist");
                    ins = null;
                }
            }else if(input.contains("2")) {
                ins = FileReader.readFile(FileReader.openFile());
            }
        }
        scan.close();

        printRegisters();

        //String[] ins = FileReader.readFile("C:\\Users\\thoma\\Desktop\\neww.legv8asm.machine");
        Instruction[] instructions = new Instruction[ins.length];
        for(int i = 0 ; i < ins.length;i++){
            instructions[i] = Instruction.findInstruction(ins[i]);
        }
        printInstruction(instructions);
        for(iterator = 0; iterator < instructions.length;iterator++) {
        	try {
        	//System.out.println(iterator);
        	instructions[iterator].execute();
        	//printRegisters();
        	}catch(Exception e) {
        		printInstructionFail(instructions);
        	}
        }

        printRegisters();
        //Memory.print();
    }
    
    public static void printInstruction(Instruction[] instructions) {
    	for(int i = 0 ; i < instructions.length;i++){
            if(instructions[i] != null) {
                System.out.println(instructions[i].getInstruction());
            }else{
                System.out.println("Fail on line " + i+1);
            }
        }
    }
    public static void printInstructionFail(Instruction[] instructions) {
    	for(int i = 0 ; i < instructions.length;i++){
            if(instructions[i] != null) {
            	if(i == iterator) {
            		System.out.print("--->");
            	}
                System.out.println(instructions[i].getInstruction());
            }else{
                System.out.println("Fail on line " + i+1);
            }
        }
    }

    public static void printRegisters() {
        for (int i=0 ; i<32 ; i++)
        {
            System.out.println("X" + i + " h: " + Integer.toHexString((int)Registers.get(i)) + " d:" + (int)Registers.get(i));
        }
    }
    
}
