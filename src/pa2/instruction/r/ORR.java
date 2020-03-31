package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class ORR extends RInstruction {
    public ORR(String binary) {
        super(binary, "ORR", "10101010000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ORR(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +", X" + Rn + ", X" + Rm;
    }
}
