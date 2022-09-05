package algorithm.programmers.heap;

import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] job : jobs) {
            pq.add(job[0]);
        }

        int i = 0;
        while (!pq.isEmpty()) {
            int time = 0;
            if (pq.poll() == jobs[i][0]) {
                time += jobs[0][i];
            }
            i++;
            for(int j = 0; j < pq.size(); j++) {
                if()
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
