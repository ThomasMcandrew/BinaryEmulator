package pa2.instruction.b;

import pa2.instruction.BInstruction;
import pa2.instruction.Instruction;

public class B extends BInstruction {

    public B(String binary) {
        super(binary, "B", "000101");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new B(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " " + address;
    }
}
