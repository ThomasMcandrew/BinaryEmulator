package pa2.instruction;

import pa2.utils.BinaryUtils;

public abstract class CBInstruction extends Instruction {
    protected int COND_BR_address, Rt;
    public CBInstruction(String binary, String name, String opcode) {
        super(binary, name, opcode);
        if(binary != null){
            parse();
        }
    }


    @Override
    protected void parse() {
        String op = binary.substring(0,8);
        String cond = binary.substring(8,27);
        String rt = binary.substring(27,32);
        opcode = op;
        COND_BR_address = (int)BinaryUtils.parseBinaryBranch(cond)-1;
        Rt =(int)BinaryUtils.parseBinary(rt);
    }
}
