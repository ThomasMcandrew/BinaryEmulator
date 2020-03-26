package pa2.instruction;

public abstract class DInstruction extends Instruction {
    protected int DT_adress, op, Rn, Rt;
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

    }
}
