package algorithm.programmers.heap;

import java.util.*;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));
        answer = jobs[0][1];
        Deque<Integer> dq = new LinkedList<>();
        dq.add(jobs[1][0]);

        while (!dq.isEmpty()) {
            answer++;
            for (int i = 0; i < jobs.length; i++) {
                if (answer == jobs[i][1]) {
                    dq.poll();
                } else if (dq.peek() <= jobs[i][0]) {
                    if ()
                    dq.add(jobs[i][0]);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DiskController diskController = new DiskController();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};

        System.out.println(diskController.solution(jobs));
    }
}
