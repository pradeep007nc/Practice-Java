package csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
      String File = "src\\csv\\pilli.csv";
        BufferedReader br = null;
        String line="";
        try {
            br = new BufferedReader(new FileReader(File));
            while ((line = br.readLine()) != null){
               String[] row = line.split(",");
               for (String index: row){
                   System.out.printf("%-10s",index);
               }
               System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
