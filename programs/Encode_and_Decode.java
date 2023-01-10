import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encode_and_Decode {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("init");
        list.add("love:");
        list.add("lint,.love;");
        list.add("kam][nf");
        System.out.println(list);
        String str = encode(list);
        System.out.println(str);
        List<String> list1 = decode(str);
        System.out.print(list1);
    }
    public static String encode(List<String> strs) {
        // write your code here
        String str = "";
        for (String string: strs){
            str += string;
            str += "::;;::";
        }
        return str;
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        // write your code here
        String[] str1 = str.split("::;;::");
        List<String> str2=new ArrayList<>();
        str2 = Arrays.stream(str1).toList();
        return str2;
    }
}