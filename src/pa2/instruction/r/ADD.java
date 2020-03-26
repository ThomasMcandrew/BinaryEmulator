package pa2.instruction.r;

import pa2.emu.Registers;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class ADD extends RInstruction {


    public ADD(String binary) {
        super(binary, "ADD","10001011000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ADD(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) + Registers.get(Rm));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +" X" + Rn + " X" + Rm;
    }
}
