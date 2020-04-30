package pa2.instruction.r;

import pa2.emu.Registers;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class PRNT extends RInstruction {
    public PRNT(String binary) {
        super(binary, "PRNT", "11111111101");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new PRNT(binary);
    }

    @Override
    public void execute() {
    	System.out.println("X" + Rd + "  " + Integer.toHexString((int)Registers.get(Rd)) + " " + Registers.get(Rd));
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd;
    }
}
