package algorithm.programmers.heap;

import java.util.*;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = jobs[0][1];

        Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < jobs.length; i++) {
            for (int j = i + 1; j < jobs.length; j++) {
                if (jobs[i][1] > jobs[j][0]) {

                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        DiskController diskController = new DiskController();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}, {12, 5}};

        System.out.println(diskController.solution(jobs));
    }
}
