package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (true) {
            s = br.readLine();
            if (s.equals(".")) {
                break;
            }
            B4949(s);
        }
    }
    public static void B4949(String s){

        Stack<Character> stack = new Stack<>();
        for(int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);


            if(c == '(' || c == '[') {
                stack.push(c);
            } else if(c == ')' || c == ']') {
                stack.pop();
            } else if(c == '.') {
                break;
            }
        }
        if(stack.empty()) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

