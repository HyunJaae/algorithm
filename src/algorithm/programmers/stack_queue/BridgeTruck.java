package algorithm.programmers.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> dq = new LinkedList<>();
        int sum = 0; // 다리를 건너는 트럭들의 무게 합

        for (int t : truck_weights) {

            while (true) {
                // 다리가 비었을 때 트럭 삽입
                if (dq.isEmpty()) {
                    dq.offer(t);
                    sum += t;
                    answer++;
                    break;
                } // 다리가 비어있지 않을 때
                else {
                    // 큐의 사이즈와 다리의 길이가 같다면 큐에서 처음 값을 빼고 무게 합 마이너스
                    if(dq.size() == bridge_length) {
                        sum -= dq.poll();
                    } // 다음 트럭이 무게 초과
                    else if(sum + t > weight) {
                        dq.offer(0);
                        answer++;
                    } // 다음 트럭이 최대 무게 이내
                    else {
                        dq.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }
        // 걸린 시간 + 마지막 트럭의 통과 시간 (다리의 길이)
        return answer + bridge_length;
    }

    static class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }

        public void moving() {
            move++;
        }
    }

    public static int solution00(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for (int t : truckWeights) {
            waitQ.offer(new Truck(t));
        }

        int answer = 0;
        int curWeight = 0;

        while (!waitQ.isEmpty() || !moveQ.isEmpty()) {
            answer++;

            if (moveQ.isEmpty()) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                continue;
            }

            for (Truck t : moveQ) {
                t.moving();
            }

            assert moveQ.peek() != null;
            if (moveQ.peek().move > bridgeLength) {
                Truck t = moveQ.poll();
                curWeight -= t.weight;
            }

            if (!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
            }
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
