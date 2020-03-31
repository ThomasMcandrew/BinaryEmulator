package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class LSL extends RInstruction {

    public LSL(String binary) {
        super(binary, "LSL", "11010011011");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new LSL(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " " + Rd + " " + Rn + " #" + shamt;
    }
}
