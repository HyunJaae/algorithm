package algorithm.programmers.stack_queue;

import java.util.*;

public class FunctionDev {
    public static int[] solution(int[] progresses, int[] speeds) {

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int time = (100 - progresses[i]) / speeds[i];

            if((100 - progresses[i]) % speeds[i] > 0) {
                time++;
            }

            if(deque.peek() == null || deque.peekLast() < time) {
                deque.add(time);
            } else if (deque.peekLast() >= time) {
                deque.add(deque.peekLast());
            }
        }

        int size = deque.size();

        ArrayList<Integer> list = new ArrayList<>();

        int result = 1;
        for (int i = 0; i < size; i++) {
            if(deque.removeFirst().equals(deque.peek())) {
                result++;
            } else {
                list.add(result);
                result = 1;
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static int[] solution00(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }

    public static void main(String[] args) {
        // 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 배열
        int[] progresses = {93, 30, 55};
        int[] progresses00 = {95, 90, 99, 99, 80, 99};
        // 각 작업의 개발 속도가 적힌 배열
        int[] speeds = {1, 30, 5};
        int[] speeds00 = {1, 1, 1, 1, 1, 1};
        // 각 배포마다 몇 개의 기능이 배포되는지를 담은 배열 리턴
        int[] result = solution(progresses, speeds);
        int[] result00 = solution(progresses00, speeds00);

        int[] other = solution00(progresses, speeds);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result00));
        System.out.println(Arrays.toString(other));
    }
}
