package algorithm.programmers.heap;

import java.util.*;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(jobs[0][1]);

        while (!pq.isEmpty()) {
            for (int i = 0; i < jobs.length; i++) {
                if (pq.peek() == null) break;
                if (pq.peek() > jobs[i][0]) {
                    pq.add(pq.peek() - jobs[i][0] + jobs[i][1]);
                } else {
                    pq.poll();
                    pq.add(jobs[i][1]);
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
