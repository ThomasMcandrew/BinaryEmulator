package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class UDIV extends RInstruction {
    public UDIV(String binary) {
        super(binary, "UDIV", "10011010110");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new UDIV(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return null;
    }
}
