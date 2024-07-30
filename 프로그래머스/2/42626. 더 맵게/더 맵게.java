import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int sco : scoville) {
                heap.add(sco);
        }

        while (!heap.isEmpty()) {
            int x = 0;
            
            for (int h : heap) {
                if (h < K) {
                    x = 1;
                    break;
                }
            }
            if (x != 1) {
                return answer;
            }
            answer++;
            if (heap.size() >= 2) {
                int a = heap.poll();
                if(heap.peek() == null) {
                    return -1;
                }
                int b = heap.poll() * 2;
                int mix = a + b;
                heap.add(mix);
            } else {
                answer = -1;
                heap.clear();
            }
        }
        return answer;
    }
}