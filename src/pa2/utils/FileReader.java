package pa2.utils;

import java.io.*;
import java.util.ArrayList;

public class FileReader {


    public static String[] readFile(String path) throws IOException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];//may need work
        in.read(bytes);
        in.close();
        ArrayList<String> Instruction = new ArrayList<String>();
        String temp = "";
        int i = 0;
        while(i < bytes.length){
            temp += String.format("%8s", Integer.toBinaryString(bytes[i] & 0xFF)).replace(' ', '0');
            i++;
            if(i%4 == 0){
                Instruction.add(temp);
                temp = new String("");
            }
        }
        String[] val = new String[Instruction.size()];
        for(i = 0; i < val.length; i++){
            val[i] = Instruction.get(i);
        }
        return val;
    }


}
