class Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey > 0) {
            int n = storey % 10; // 일의 자리
            storey /= 10; // 일의 자리를 제외한 나머지 값
            
            if (n == 5) {
                if (storey % 10 >= 5) { // 앞자리 수가 5보다 큰 경우
                    answer += 10 - n;
                    storey++;
                } else {
                    answer += n;
                }
            } else if (n > 5) {
                answer += 10 - n;
                storey++;
            } else {
                answer += n;
            }
        }
        return answer;
    }
}