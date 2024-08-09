import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        if (people.length == 1) return 1;
        int answer = 0;
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        
        while (start < end) {
            answer++;
            if (people[start] + people[end] <= limit) start++;
            end--;
            if (start == end) answer++;
        }
        return answer;
    }
}