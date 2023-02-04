package problemSolving;

import java.util.*;

public class main {

    public int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]) return new int[]{i};
            int num = arr[i];
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(num, i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,54,6,7,8,9};
        int target = 11;
        main main = new main();
        int[] ans = main.twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
