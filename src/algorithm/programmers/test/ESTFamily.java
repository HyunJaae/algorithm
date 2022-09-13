package algorithm.programmers.test;

import java.util.*;

public class ESTFamily {
    public int solution(int[][] histogram) {
        int answer = 0;

        for (int i = 0; i < histogram[0].length; i++) {
            Deque<Integer> dq = new LinkedList<>();
            for (int[] h : histogram) {
                // 맨 왼쪽부터 각 기둥의 원소 값을 큐에 더한다.
                dq.add(h[i]);
            }

            boolean x = false;
            for (int j = 0; j < histogram.length; j++) {
                int h = dq.removeFirst();
                // 현재 값이 손상된 값인 경우와 손상된 값 다음이 비어 있는 경우 유추 값 +1
                if (h == 2) {
                    answer++;
                    x = true;
                    // 손상된 값 다음이 비어 있고 그 다음에 막대 그래프가 있는 경우 처음 손상된 값에서 추가한 유추 값을 -1
                    if (!dq.isEmpty() && dq.peek() == 0) {
                        dq.removeFirst();
                        if (!dq.isEmpty() && dq.peek() == 1) {
                            answer--;
                        }
                    }
                }
                // 큐 값이 1인 경우 유추 값 +1, 반복문을 끝냅니다.
                if (h == 1) {
                    answer++;
                    x = false;
                    break;
                }
            }
            // x 가 true 인 경우 큐에서 1 값이 안나오고 마지막까지 2만 나온 것이기 때문에 막대가 없는, 높이가 0인 경우도 더합니다.
            if (x) answer++;
        }
        return answer;
    }

    public int[] solution(int[] queue) {
        int[] answer = new int[3];

        int[] arr = new int[3];

        Deque<Integer> dq = new LinkedList<>();
        for (int q : queue) {
            dq.add(q);
        }

        while (true) {
            for (int j : queue) {
                if (j == 1) arr[0]++;
                if (j == 2) arr[1]++;
                if (j == 3) arr[2]++;
            }
            break;
        }

        return answer;
    }

    public static void main(String[] args) {
        ESTFamily estFamily = new ESTFamily();
        int[][] histogram = {{0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 1, 0, 0, 1}, {0, 1, 0, 1, 0, 0, 1},
                            {1, 1, 2, 2, 1, 0, 1}, {2, 2, 2, 2, 1, 2, 2}, {2, 2, 1, 1, 1, 2, 2},
                            {2, 2, 1, 1, 1, 2, 2}};
        int[][] histogram00 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {2, 2, 0, 0, 0}, {1, 0, 1, 0, 0},
                {2, 1, 2, 2, 2}, {2, 1, 2, 2, 2}};
        String first = "1번 문제: ";
        System.out.println(first + estFamily.solution(histogram));
        System.out.println(first + estFamily.solution(histogram00));
        System.out.println("\n");
        int[] queue = {2, 1, 3, 1, 2, 1};
        int[] queue00 = {3, 3, 3, 3, 3, 3};
        int[] queue01 = {1, 2, 3};
        String sec = "2번 문제: ";
        System.out.println(sec + Arrays.toString(estFamily.solution(queue)));
        System.out.println(sec + Arrays.toString(estFamily.solution(queue00)));
        System.out.println(sec + Arrays.toString(estFamily.solution(queue01)));
    }
}
