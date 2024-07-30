import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) pq.offer(s);
        if (pq.peek() >= K) return answer;
        while (pq.size() > 1 && pq.peek() < K) {
            pq.offer(pq.poll() + 2 * pq.poll());
            answer++;
        }
        return pq.peek() >= K ? answer : -1;
    }
}