package algorithm.programmers.stack_queue;

import java.util.Deque;
import java.util.LinkedList;

public class bridgeTruck {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Deque<Integer> dq = new LinkedList<>();
        for (int truckWeight : truck_weights) {
            dq.add(truckWeight);
        }

        while (!dq.isEmpty()) {
            int total = 0;

            for (int i = 0; i < bridge_length; i++) {
                if (dq.isEmpty()) {
                    answer++;
                } else {
                    int poll = dq.poll();
                    total += poll;

                    if (total <= weight) answer++;
                    else {
                        answer += bridge_length;
                        dq.add(poll);
                    }
                }
            }
        }
        if (truck_weights.length <= bridge_length) {
            answer = answer + truck_weights.length;
        }
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
