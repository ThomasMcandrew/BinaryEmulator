package pa2.instruction.i;

import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;

public class SUBIS extends IInstruction {
    public SUBIS(String binary) {
        super(binary, "SUBIS", "1111000100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SUBIS(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + ", X" + Rn + ", #" + immediate;
    }
}
