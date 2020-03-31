package pa2.instruction;

import pa2.instruction.d.STUR;
import pa2.instruction.i.ADDI;
import pa2.instruction.i.SUBI;
import pa2.instruction.i.SUBIS;
import pa2.instruction.r.*;

public abstract class Instruction {
    protected String opcode;
    protected String name;
    protected String binary;
    public static Instruction instructions[] = {new ADD(null),new ADDI(null),new MUL(null),new ORR(null),
    new PRNT(null),new PRNL(null),new SUB(null),new SUBS(null),new ADDI(null),new SUBI(null),
    new SUBIS(null),new STUR(null)};
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
