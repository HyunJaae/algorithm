package algorithm.programmers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        // 각 배열의 0번째 요소로 정렬 -> 요청 시간별로 정렬
        Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));

        PriorityQueue<Integer> timeQue = new PriorityQueue<>();
        timeQue.add(jobs[0][0]);
        // 요청 시간으로부터 순차적으로 진행 했을 때
        while (!timeQue.isEmpty()) {
            answer++;

        }

        answer = timeQue.remove();
        return answer;
    }

    public static void main(String[] args) {
        DiskController diskController = new DiskController();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};

        System.out.println(diskController.solution(jobs));
    }
}
