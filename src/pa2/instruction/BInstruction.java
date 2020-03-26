package pa2.instruction;

import pa2.utils.BinaryUtils;

public abstract class BInstruction extends Instruction {
    protected int adress;
    public BInstruction(String binary, String name, String opcode) {
        super(binary, name, opcode);
        if(binary != null){
            parse();
        }
    }

    @Override
    protected void parse() {
        String op = binary.substring(0,6);
        String ad = binary.substring(6,32);
        opcode = op;
        adress = BinaryUtils.parseBinary(ad);
    }
}
