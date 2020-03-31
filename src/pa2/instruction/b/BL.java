package pa2.instruction.b;

import pa2.instruction.BInstruction;
import pa2.instruction.Instruction;

public class BL extends BInstruction {

    public BL(String binary) {
        super(binary, "BL", "100101");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new BL(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " " + address;
    }
}
