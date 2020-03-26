package pa2.instruction.i;

import pa2.emu.Registers;
import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;

public class ADDI extends IInstruction {
    public ADDI(String binary) {
        super(binary, "ADDI", "1001000100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ADDI(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) + immediate);
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd + " X"+ Rn + " #" + immediate;
    }
}
