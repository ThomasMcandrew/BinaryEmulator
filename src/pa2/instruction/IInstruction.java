package pa2.instruction;

import pa2.utils.BinaryUtils;

public  abstract class IInstruction extends Instruction {

    protected int immediate,Rn,Rd;

    public IInstruction(String binary,String name,String opcode) {
        super(binary, name,opcode);
        if(binary != null){
            parse();
        }

    }

    @Override
    protected void parse() {
        String op = binary.substring(0,10);
        String imm = binary.substring(10,22);
        String rn = binary.substring(22,27);
        String rd = binary.substring(27,32);
        opcode = op;
        immediate = BinaryUtils.parseBinary(imm);
        Rn = BinaryUtils.parseBinary(rn);
        Rd = BinaryUtils.parseBinary(rd);
    }
}
