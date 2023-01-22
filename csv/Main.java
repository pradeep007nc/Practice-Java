package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        try {
            String File = "src\\csv\\dummy2.csv";
            PrintWriter pw = new PrintWriter("src\\csv\\pilli.csv");
            BufferedReader br = null;
            String line="";
            br = new BufferedReader(new FileReader(File));
            while ((line = br.readLine()) != null){
               String[] row = line.split(",");
               for (String i:row){
                   pw.append(i+",");
               }
               pw.append(" \n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
