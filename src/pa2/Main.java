package pa2;

import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;
import pa2.utils.FileReader;

import java.io.IOException;

public class Main {




    public static void main(String[] args) throws IOException {
//        System.out.println("foo");
//        String[] foo = FileReader.readFile("fooo");
//        for(int i = 0; i < foo.length;i++){
//            System.out.println(foo[i]);
//        }
        String instr = "10001011000111110000001111111111";
        System.out.println(instr.length());
        Instruction foo = Instruction.findInstruction(instr);
        System.out.println(foo.getInstruction());

        String in2 = "10010001000000001000111111100000";
        Instruction fum = IInstruction.findInstruction(in2);
        System.out.println(fum.getInstruction());



        //this code is for the real emulator
        /*
        String[] ins = FileReader.readFile("");
        Instruction[] instructions = new Instruction[ins.length];
        for(int i = 0 ; i < ins.length;i++){
            instructions[i] = Instruction.findInstruction(ins[i]);
        }
        for(int i = 0 ; i < ins.length;i++){
            instructions[i].execute();
        }
        */


    }
}
