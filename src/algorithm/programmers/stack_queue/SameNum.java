package algorithm.programmers.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SameNum {
    public static int[] solution(int []arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(arr[0]);

        for (int num : arr) {
            if(deque.getLast() != num) {
                deque.add(num);
            }
        }

        int[] answer = new int[deque.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = deque.pop();
        }
        return answer;
    }

    public static int[] stackSolution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);

        for (int num : arr) {
            if(stack.peek() != num) stack.add(num);
        }

        int[] answer = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr00 = {4, 4, 4, 3, 3};
        int[] results = solution(arr);
        int[] results00 = solution(arr00);

        System.out.print("result : ");
        for (int result : results) {
            System.out.print(result);
        }

        System.out.print("\nresult00 : ");
        for (int result : results00) {
            System.out.print(result);
        }
    }
}
