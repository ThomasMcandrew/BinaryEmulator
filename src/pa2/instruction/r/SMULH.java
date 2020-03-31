package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class SMULH extends RInstruction {
    public SMULH(String binary) {
        super(binary, "SMULH", "10011011010");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SMULH(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return null;
    }
}
