package pa2;

import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;
import pa2.utils.FileReader;

import java.io.IOException;

public class Main {




    public static void main(String[] args) throws IOException {






        String[] ins = FileReader.readFile(FileReader.openFile());
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
