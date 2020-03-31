package pa2.instruction.cb;

import pa2.instruction.CBInstruction;
import pa2.instruction.Instruction;

public class CBZ extends CBInstruction {

    public CBZ(String binary) {
        super(binary, "CBZ", "10110100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new CBZ(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X" + Rt + ", " + COND_BR_address;
    }
}
