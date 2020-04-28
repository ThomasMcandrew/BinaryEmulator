package pa2.instruction.cb;

import pa2.Main;
import pa2.instruction.CBInstruction;
import pa2.instruction.Instruction;

public class CBNZ extends CBInstruction {

    public CBNZ(String binary) {
        super(binary, "CBNZ", "10110101");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new CBNZ(binary);
    }

    @Override
    public void execute() {
            if(Rt!=0)
            {
                Main.iterator+=COND_BR_address;
            }
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rt + ", " + COND_BR_address;
    }
}
