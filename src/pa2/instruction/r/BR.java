package pa2.instruction.r;

import pa2.Main;
import pa2.emu.Registers;
import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class BR extends RInstruction {

    public BR(String binary) {
        super(binary, "BR", "11010110000");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new BR(binary);
    }

    @Override
    public void execute() {
        Main.iterator=(int)Registers.get(Rn)-1;
    }

    @Override
    public String getInstruction() {
        return name + " X" +Rn;
    }
}
