package pa2.instruction.r;

import pa2.emu.Registers;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class SUB extends RInstruction {
    public SUB(String binary) {
        super(binary, "SUB", "11001011000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SUB(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,(Registers.get(Rn)-Registers.get(Rm)));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +", X" + Rn + ", X" + Rm;
    }
}
