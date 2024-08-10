import java.util.Arrays;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int len = number.length();
        char[] numbers = number.toCharArray();
        int cnt = len - k;
        int start = 0;
        while (cnt > 0) {
            char max = '0';
            for (int i = start; i <= len - cnt; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                    start = i + 1;
                }
            }
            answer.append(max);
            cnt--;
        }
        
        return answer.toString();
    }
}