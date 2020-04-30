package pa2.instruction.r;

import pa2.emu.Memory;
import pa2.emu.Stack;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class HALT extends RInstruction {

    public HALT(String binary) {
        super(binary, "HALT", "11111111111");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new HALT(binary);
    }

    @Override
    public void execute() {
    	System.out.println("______Stack______");
    	Stack.print();
    	System.out.println("_____Memory______");
    	Memory.print();
    	System.exit(1);
    }

    @Override
    public String getInstruction() {
        return name;
    }
}
