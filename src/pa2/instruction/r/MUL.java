package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class MUL extends RInstruction {
    public MUL(String binary) {
        super(binary, "MUL", "10011011000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new MUL(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +", X" + Rn + ", X" + Rm;
    }
}
