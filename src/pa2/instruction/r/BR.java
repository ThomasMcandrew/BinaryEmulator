package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class BR extends RInstruction {

    public BR(String binary) {
        super(binary, "BR", "11010110000");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new BR(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X" +Rn;
    }
}
