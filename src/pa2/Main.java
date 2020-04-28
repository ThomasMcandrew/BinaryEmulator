package pa2;

import pa2.instruction.Instruction;
import pa2.utils.FileReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        

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

        //String[] ins = FileReader.readFile("C:\\Users\\thoma\\Desktop\\neww.legv8asm.machine");
        Instruction[] instructions = new Instruction[ins.length];
        for(int i = 0 ; i < ins.length;i++){
            instructions[i] = Instruction.findInstruction(ins[i]);
        }
        for(int i = 0 ; i < instructions.length;i++){
            if(instructions[i] != null) {
                System.out.println(instructions[i].getInstruction());
            }else{
                System.out.println("Fail on line " + i+1);
            }
        }
    }
}
