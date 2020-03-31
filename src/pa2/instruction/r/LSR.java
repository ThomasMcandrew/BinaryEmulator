package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class LSR extends RInstruction {

    public LSR(String binary) {
        super(binary, "LSR", "11010011010");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new LSR(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " " + Rd + " " + Rn + " #" + shamt;
    }
}
