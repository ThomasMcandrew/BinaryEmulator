package pa2.instruction.r;

import pa2.emu.Registers;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class EOR extends RInstruction {

    public EOR(String binary) {
        super(binary, "EOR", "11001010000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new EOR(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) ^ Registers.get(Rm));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +" X" + Rn + " X" + Rm;
    }
}
