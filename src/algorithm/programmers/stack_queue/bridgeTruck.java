package algorithm.programmers.stack_queue;

import java.util.Deque;
import java.util.LinkedList;

public class bridgeTruck {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Deque<Integer> dq = new LinkedList<>();
        for (int truck : truck_weights) {
            dq.add(truck);
        }
        Deque<Integer> resultDq = new LinkedList<>();

        while (!dq.isEmpty()) {
            int totalWeight = 0;
            for (int i = 0; i < bridge_length; i++) {
                if (dq.peek() != null) {
                    int pop = dq.pop();
                    totalWeight += pop;
                    if (totalWeight > weight) {
                        dq.addFirst(pop);
                    } else {
                        resultDq.add(pop);
                    }
                }
                answer++;
            }
        }

        if (truck_weights.length <= bridge_length) answer += resultDq.size();

        return answer;
    }

    public static void main(String[] args) {
        int bridgeLength = 2;
        int bridgeLength00 = 100;
        int weight = 10;
        int weight00 = 100;
        int[] truckWeights = {7, 4, 5, 3};
        int[] truckWeights00 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] truckWeights01 = {90, 90, 90, 90, 90};

        System.out.println(solution(bridgeLength, weight, truckWeights));
        System.out.println(solution(bridgeLength00, weight00, truckWeights01));
    }
}
