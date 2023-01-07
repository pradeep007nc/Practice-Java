import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int count=0;
        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

    public static String getFrequencyString(String str){
       int[] freq=new int[26];
       for (char c: str.toCharArray()){
           freq[c - 'a']++;
       }

       StringBuilder sb=new StringBuilder("");
       char c = 'a';
       for (int i : freq){
           sb.append(c);
           sb.append(i);
           c++;
       }
       return sb.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs.length == 0 || strs == null) return new ArrayList<>();

        Map<String, List<String>> map=new HashMap<>();
        for (String str:strs){
            String freuencyString = getFrequencyString(str);

            if(map.containsKey(freuencyString)){
                map.get(freuencyString).add(str);
            }else {
                List<String> stringList=new ArrayList<>();
                stringList.add(str);
                map.put(freuencyString, stringList);
            }

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        System.out.print(groupAnagrams(str));
    }

}
