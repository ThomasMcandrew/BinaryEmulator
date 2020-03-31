package pa2.instruction.r;

import pa2.instruction.Instruction;
import pa2.instruction.RInstruction;

public class SDIV extends RInstruction {
    public SDIV(String binary) {
        super(binary, "SDIV", "10011010110");
        //may need to alster shamt??
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SDIV(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return null;
    }
}
