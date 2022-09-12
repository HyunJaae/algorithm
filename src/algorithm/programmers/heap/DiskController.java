package algorithm.programmers.heap;

import java.util.*;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int count = 0; // 처리된 디스크
        int now = 0; //작업이 끝난시간
        // 요청 시간 순으로 오름차순
        Arrays.sort(jobs, (Comparator.comparingInt(o -> o[0])));
        // 수행 시간 순으로 우선순위 큐
        PriorityQueue<int[]> queue = new PriorityQueue<>((Comparator.comparingInt(o -> o[1])));

        int i = 0;
        while(count < jobs.length){
            while (i< jobs.length && jobs[i][0] <= now){
                queue.add(jobs[i++]);
            }
            for (int [] q : queue) System.out.println(count + " arr : " + Arrays.toString(q));
            if(queue.isEmpty()){
                now = jobs[i][0];
            }else{
                int[] tmp = queue.poll();
                answer += tmp[1] + now - tmp[0];
                now += tmp[1];
                count++;
            }
        }

        return answer / jobs.length;
    }

    public static void main(String[] args) {
        DiskController diskController = new DiskController();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}, {12, 5}};

        System.out.println(diskController.solution(jobs));
    }
}
