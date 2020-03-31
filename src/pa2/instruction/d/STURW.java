package pa2.instruction.d;

import pa2.instruction.DInstruction;
import pa2.instruction.Instruction;

public class STURW extends DInstruction {
    public STURW(String binary) {
        super(binary, "STURW", "10111000000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new STURW(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return null;
    }
}
