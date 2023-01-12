class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'p') p++;
            else if (c == 'y') y++;
        }
        
        answer = p == y ? true : false;

        return answer;
    }
}