package pa2.instruction.r;

import pa2.emu.ConditionBits;
import pa2.emu.Registers;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class SUBS extends RInstruction {
    public SUBS(String binary) {
        super(binary, "SUBS", "11101011000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SUBS(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,(Registers.get(Rn)-Registers.get(Rm)));
        ConditionBits.set((Registers.get(Rn)-Registers.get(Rm)));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +", X" + Rn + ", X" + Rm;
    }
}
