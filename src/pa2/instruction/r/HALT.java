package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class HALT extends RInstruction {

    public HALT(String binary) {
        super(binary, "HALT", "11111111111");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new HALT(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name;
    }
}
