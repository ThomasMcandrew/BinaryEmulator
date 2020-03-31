package pa2.instruction.d;

import pa2.instruction.DInstruction;
import pa2.instruction.Instruction;

public class LDUR extends DInstruction {

    public LDUR(String binary) {
        super(binary, "LDUR", "11111000010");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new LDUR(binary);
    }

    @Override
    public void execute() {

    }

    @Override
    public String getInstruction() {
        return name + " X" + Rt + ", [X" + Rn+ ", #" + DT_address + "]";
    }
}
