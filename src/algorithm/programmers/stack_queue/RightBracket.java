package algorithm.programmers.stack_queue;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.LinkedList;

public class RightBracket {
    static boolean solution(String s) {
        boolean answer = true;

        if (s.charAt(0) == ')') {
            return false;
        }

        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (deque.peek() == null || deque.peek() == c) {
                deque.add(c);
            } else if (deque.peek() != c && c != '(') {
                deque.removeFirst();
            }
        }

        if (!deque.isEmpty()) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String st = "()()";
        String sst = "(())()";
        String sf = ")()(";
        String ssf = "(()(";
        String sssf = "()(()))(";

        System.out.println(solution(st));
        System.out.println(solution(sst));
        System.out.println(solution(sf));
        System.out.println(solution(ssf));
        System.out.println(solution(sssf));
    }
}
