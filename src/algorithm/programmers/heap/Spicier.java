package algorithm.programmers.heap;

import java.util.PriorityQueue;

public class Spicier {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int sco : scoville) {
                heap.add(sco);
        }
        System.out.println(heap);

        while (!heap.isEmpty()) {
            answer++;
            if (heap.size() >= 2) {
                int a = heap.poll();
                if(heap.peek() == null) {
                    return -1;
                }
                int b = heap.poll() * 2;
                int mix = a + b;
                if (mix < K) {
                    heap.add(mix);
                } else if(mix == 0) {
                    answer = -1;
                    break;
                }
            } else if (heap.peek() >= K) {
                answer++;
                heap.poll();
            } else {
                answer = -1;
                heap.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        Spicier spicier = new Spicier();
        int result = spicier.solution(scoville, k);
        System.out.println(result);
    }
}
