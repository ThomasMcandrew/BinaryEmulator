package pa2.instruction.r;

import pa2.emu.Memory;
import pa2.emu.Stack;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class DUMP extends RInstruction {

    public DUMP(String binary) {
        super(binary, "DUMP", "11111111110");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new DUMP(binary);
    }

    @Override
    public void execute() {
    	System.out.println("______Stack______");
    	Stack.print();
    	System.out.println("_____Memory______");
    	Memory.print();
    	
    }

    @Override
    public String getInstruction() {
        return name;
    }
}
