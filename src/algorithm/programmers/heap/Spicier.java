package algorithm.programmers.heap;

import java.util.PriorityQueue;

public class Spicier {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선 순위 큐 생성
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        // 우선 순위대로 큐에 모든 스코빌 지수 추가 (오름차순)
        for (int sco : scoville) {
                heap.add(sco);
        }

        while (!heap.isEmpty()) {
            int x = 0;
            // K 스코빌 지수보다 작은 값이 하나라도 있으면 x = 1
            for (int h : heap) {
                if (h < K) {
                    x = 1;
                    break;
                }
            }
            // x 가 1이 아닐 때, heap 내에 있는 값들이 K 스코빌 지수보다 모두 클 경우 리턴
            if (x != 1) {
                return answer;
            }
            // K 스코빌 지수보다 하나라도 작은 값이 있으면 1회 추가를 시작으로 진행
            answer++;
            // heap 사이즈가 2보다 큰 경우
            if (heap.size() >= 2) {
                // 가장 작은 수를 먼저 꺼내고
                int a = heap.poll();
                if(heap.peek() == null) {
                    return -1;
                }
                // 그 다음 지수가 낮은 수를 꺼내 곱하기 2
                int b = heap.poll() * 2;
                // 두개를 더한 다음
                int mix = a + b;
                // 다시 heap 에 더한다.
                heap.add(mix);
            } else { // heap 사이즈가 1일 경우 마지막 남은 값이 K 스코빌 지수보다 작은 경우 더이상 섞을 수 없으므로 -1을 하고 heap 을 비운다
                answer = -1;
                heap.clear();
            }
        }
        return answer;
    }

    public int solution00(int[] scoville, int K) {
        PriorityQueue<Integer> pqScov = new PriorityQueue<>();
        for (int s: scoville) {
            pqScov.add(s);
        }

        int cnt = 0;
        while (pqScov.size() > 1 && pqScov.peek() < K) {
            pqScov.add(pqScov.remove() + pqScov.remove() * 2);
            cnt++;
        }

        assert pqScov.peek() != null;

        return pqScov.peek() >= K ? cnt : -1;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 1, 1, 1, 1, 1};
        int k = 7;
        Spicier spicier = new Spicier();
        int result = spicier.solution00(scoville, k);
        System.out.println(result);
    }
}
