import java.util.LinkedList;
import java.util.Queue;

class Solution {
    Queue<Integer> q = new LinkedList<Integer>();
    public int solution(int[] numbers, int target) {
        int answer = 0;
        q.offer(0);
        q.offer(0);
        while(q.peek() != null){
            int depth =q.poll();
            int sum = q.poll();
            if(depth == numbers.length){
                if(sum == target)
                    answer++;
            }else {

                q.offer(depth + 1);
                q.offer(sum + numbers[depth]);

                q.offer(depth + 1);
                q.offer(sum - numbers[depth]);
            }
        }
        return answer;
    }   
}