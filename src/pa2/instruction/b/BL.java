package pa2.instruction.b;

import pa2.Main;
import pa2.emu.Registers;
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
        Registers.set(30, Main.iterator+1);
        Main.iterator+=address;
    }

    @Override
    public String getInstruction() {
        return name + " " + address;
    }
}
