package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// todo : 괄호
public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(i);

                if(c == '(') {
                    stack.push(c);
                } else if (stack.empty()) {
                    System.out.println("No");
                    break;
                } else {
                    stack.pop();
                }
            }
            if(stack.empty()) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
