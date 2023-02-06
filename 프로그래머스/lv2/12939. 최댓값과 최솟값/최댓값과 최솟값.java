import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[str.length - 1];
        
        return min + " " + max;
    }
}