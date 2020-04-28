package pa2.instruction;

import pa2.utils.BinaryUtils;

public abstract class DInstruction extends Instruction {
    protected int DT_address, op, Rn, Rt;
    public DInstruction(String binary, String name, String opcode) {
        super(binary, name, opcode);
        if(binary != null){
            parse();
        }
    }

    @Override
    protected void parse() {
        String opp = binary.substring(0,11);
        String dt = binary.substring(11,20);
        String oop = binary.substring(20,22);
        String rn = binary.substring(22,27);
        String rt = binary.substring(27,32);
        opcode = opp;
        DT_address = (int)BinaryUtils.parseBinary(dt);
        op = (int)BinaryUtils.parseBinary(oop);
        Rn = (int)BinaryUtils.parseBinary(rn);
        Rt = (int)BinaryUtils.parseBinary(rt);
    }
}
