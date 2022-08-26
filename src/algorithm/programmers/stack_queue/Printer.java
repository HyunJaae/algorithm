package algorithm.programmers.stack_queue;

import java.util.*;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            pq.add(priority);
        }

        while (!pq.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if(pq.peek() == null) break;
                if (pq.peek() == priorities[i]) {
                    pq.poll();
                    answer++;
                    if(location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static int solution00(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;



        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int[] priorities00 = {1, 1, 9, 1, 1, 1};
        int[] priorities01 = {1, 8, 9, 1};
        int[] priorities02 = {1, 3, 7, 8, 1, 2};
        // 8, 7, 3, 2, 1, 1
        int location = 2;
        int location00 = 0;
        int location01 = 1;
        int location02 = 0;

        int result = solution(priorities, location);
        int result00 = solution(priorities00, location00);
        int result01 = solution(priorities01, location01);
        int result02 = solution(priorities02, location02);
        System.out.println(result);
        System.out.println(result00);
        System.out.println(result01);
        System.out.println(result02);
    }
}
