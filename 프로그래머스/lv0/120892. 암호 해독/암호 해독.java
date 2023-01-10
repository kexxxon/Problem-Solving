class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] strArr = cipher.split("");
        
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0)
                answer += strArr[i];
        }
        
        return answer;
    }
}