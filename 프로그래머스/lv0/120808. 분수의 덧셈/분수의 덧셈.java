class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int num = num1 * num2;
        int denum = num2 * denum1 + num1 * denum2;
        int max = 1;
        
        for (int i = 1; i <= num && i <= denum; i++) {
            if (num % i == 0 && denum % i == 0) {
                max = i;
            }
        }
        
        answer[0] = denum / max;
        answer[1] = num / max;
        
        return answer;
    }
}