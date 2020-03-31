package pa2.instruction.d;

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

    }
    @Override
    public String getInstruction() {
        return name + " X" + Rn + ", [X" + Rt + ", #" + DT_address + "]";
    }
}
