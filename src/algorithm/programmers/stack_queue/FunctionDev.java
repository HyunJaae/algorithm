package algorithm.programmers.stack_queue;

import java.util.*;

public class FunctionDev {
    public static int[] solution(int[] progresses, int[] speeds) {

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            // 남은 작업량을 작업 속도로 나누면 작업 시간이 나온다.
            int time = (100 - progresses[i]) / speeds[i];
            // 남은 작업량을 작업 속도로 나누었을 때 0보다 크면 하루가 더 필요하므로 1을 더한다.
            if((100 - progresses[i]) % speeds[i] > 0) {
                time++;
            }
            // 덱이 비어있거나 바로 전에 삽입한 작업 시간이 지금 작업 시간보다 작으면
            // 바로 전 작업이 먼저 끝나도 지금 작업 시간은 남아 있으므로 지금 작업 시간을 덱에 추가한다.
            // 바로 전 작업 시간이 현 작업 시간보다 큰 경우 현 작업 시간이 끝나도 바로 전 작업 시간이 끝날 때
            // 같이 배포되기 때문에 바로 전 작업 시간으로 덱에 추가한다.
            if(deque.peek() == null || deque.peekLast() < time) {
                deque.add(time);
            } else if (deque.peekLast() >= time) {
                deque.add(deque.peekLast());
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        int size = deque.size();
        int result = 1;
        // 덱에서 처음 값과 다음 값이 같은 경우 result 값에 +1 을 하고 다른 경우 list 에 해당 result 값을 넣는다.
        for (int i = 0; i < size; i++) {
            if(deque.removeFirst().equals(deque.peek())) {
                result++;
            } else {
                list.add(result);
                result = 1;
            }
        }
        // answer 배열에 리스트 값을 넣는다.
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
