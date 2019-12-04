package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author LeiJian
 * @date 2019/12/1 20:41
 */
public class demo3 {
    public static void main(String[] args) {
        File file = new File("E:\\1.txt");
        File file2 = new File("E:\\2.txt");
        int result;
        try {
            FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter(file2);
            while((result = reader.read()) != -1){
                if(result >= '\u4e00' && result <= '\u9fa5'){
                    writer.write(result);
                    System.out.println(result);
                }
            }
            writer.flush();
            writer.close();
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
