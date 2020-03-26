package pa2.instruction;

import pa2.instruction.i.ADDI;
import pa2.instruction.r.ADD;

public abstract class Instruction {
    protected String opcode;
    protected String name;
    protected String binary;
    public static Instruction instructions[] = {new ADD(null),new ADDI(null)};
    public Instruction(String binary,String name,String opcode){
        this.opcode = opcode;
        this.name = name;
        this.binary = binary;
    }
    public abstract Instruction newInstruction(String binary);
    public abstract void execute();

    protected abstract void parse();

    public abstract String getInstruction();

    public String getName() {
        return name;
    }

    public String getOpcode() {
        return opcode;
    }
    public static Instruction findInstruction(String binary){
        for(int i = 0; i < instructions.length;i++){
            if(binary.startsWith(instructions[i].opcode)){
                return instructions[i].newInstruction(binary);
            }
        }
        return null;
    }
}
