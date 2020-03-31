package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class PRNL extends RInstruction {
    public PRNL(String binary) {
        super(binary, "PRNL", "11111111100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new PRNL(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name;
    }
}
