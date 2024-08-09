import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        if (people.length == 1) return 1;
        int answer = 0;
        Arrays.sort(people);
        int first = 0;
        int second = people.length - 1;
        
        while (first < second) {
            int a = people[first];
            int b = people[second];
            if (a + b <= limit) {
                answer++;
                first++;
                second--;
            } else {
                answer++;
                second--;
            }
            if (first == second) answer++;
        }
        return answer;
    }
}