package pa2.instruction.i;

import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;

public class ANDI extends IInstruction {

    public ANDI(String binary) {
        super(binary, "ANDI", "1001001000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ANDI(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X"+ Rd + " X"+ Rn + " #" + immediate;
    }
}
