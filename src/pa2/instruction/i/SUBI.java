package pa2.instruction.i;

import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;

public class SUBI extends IInstruction {
    public SUBI(String binary) {
        super(binary, "SUBI", "1101000100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SUBI(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + ", X" + Rn + ", #" + immediate;
    }
}
