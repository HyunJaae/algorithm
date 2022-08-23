package algorithm.programmers.stack_queue;

import java.util.Deque;
import java.util.LinkedList;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<Integer> deque = new LinkedList<>();

        for (int priority : priorities) {
            deque.add(priority);
        }

        for (int i = 0; i < deque.size(); i++) {
            int first = deque.peek();
            for (int j = 0; j < deque.size(); j++) {
                if (first < deque.peek()) {
                    deque.pop();
                }
                deque.add(deque.removeFirst());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int[] priorities00 = {1, 1, 9, 1, 1, 1};
        int[] priorities01 = {1, 1, 1, 1, 1, 9};
        int[] priorities02 = {1, 3, 7, 8, 1, 2};
        // 8, 7, 3, 2, 1, 1
        int location = 2;
        int location00 = 0;
        int location01 = 5;
        int location02 = 0;

//        int result = solution(priorities, location);
//        int result00 = solution(priorities00, location00);
//        int result01 = solution(priorities01, location01);
        int result02 = solution(priorities02, location02);
//        System.out.println(result);
//        System.out.println(result00);
//        System.out.println(result01);
        System.out.println(result02);
    }
}
