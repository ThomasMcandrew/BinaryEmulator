package pa2.instruction.i;

import pa2.instruction.IInstruction;
import pa2.instruction.Instruction;

public class EORI extends IInstruction {

    public EORI(String binary) {
        super(binary, "EORI", "1101001000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new EORI(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction()  {
        return name + " X"+ Rd + " X"+ Rn + " #" + immediate;
    }
}
