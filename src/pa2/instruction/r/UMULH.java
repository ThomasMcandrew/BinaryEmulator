package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class UMULH extends RInstruction {
    public UMULH(String binary) {
        super(binary, "UMULH", "10011011110");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new UMULH(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return null;
    }
}
