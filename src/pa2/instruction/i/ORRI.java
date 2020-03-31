package pa2.instruction.i;

import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;

public class ORRI extends IInstruction {
    public ORRI(String binary) {
        super(binary, "ORRI", "1011001000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ORRI(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + ", X" + Rn + ", #" + immediate;
    }
}
