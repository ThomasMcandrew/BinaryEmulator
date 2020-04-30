package pa2.instruction.d;

import pa2.emu.Memory;
import pa2.emu.Registers;
import pa2.emu.Stack;
import pa2.instruction.DInstruction;
import pa2.instruction.Instruction;

public class STUR extends DInstruction {
    public STUR(String binary) {
        super(binary, "STUR", "11111000000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new STUR(binary);
    }

    @Override
    public void execute() {
    	if(Rn == 28 || Rn == 29) {
    		Stack.store(Registers.get(Rt),(int)Registers.get(Rn) + DT_address);
    	}else {
    		Memory.store(Registers.get(Rt),(int)Registers.get(Rn) + DT_address);
    	}
    }
    @Override
    public String getInstruction() {
        return name + " X" + Rt + ", [X" + Rn + ", #" + DT_address + "]";
    }
}
