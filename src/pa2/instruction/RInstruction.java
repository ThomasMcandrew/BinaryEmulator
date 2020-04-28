package pa2.instruction;

import pa2.utils.BinaryUtils;

public abstract class RInstruction extends Instruction  {

    protected int Rm, shamt, Rn, Rd;

    public RInstruction(String binary,String name,String opcode) {
        super(binary,name,opcode);
        if(binary != null) {
            parse();
        }
    }

    @Override
    protected void parse(){
        String op = binary.substring(0,11);
        String rm = binary.substring(11,16);
        String sham = binary.substring(16,22);
        String rn = binary.substring(22,27);
        String rd = binary.substring(27,32);
        opcode = op;
        Rm = (int)BinaryUtils.parseBinary(rm);
        shamt = (int)BinaryUtils.parseBinary(sham);
        Rn = (int)BinaryUtils.parseBinary(rn);
        Rd = (int)BinaryUtils.parseBinary(rd);

    }

}
