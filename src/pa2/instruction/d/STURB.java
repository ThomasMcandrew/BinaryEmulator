package pa2.instruction.d;

import pa2.instruction.DInstruction;
import pa2.instruction.Instruction;

public class STURB extends DInstruction {
    public STURB(String binary) {
        super(binary, "STURB", "00111000000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new STURB(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return null;
    }
}
