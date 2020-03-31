package pa2.instruction.d;

import pa2.instruction.DInstruction;
import pa2.instruction.Instruction;

public class STURH extends DInstruction {
    public STURH(String binary) {
        super(binary, "STURH", "01111000000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new STURH(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return null;
    }
}
