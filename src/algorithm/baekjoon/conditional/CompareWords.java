package algorithm.baekjoon.conditional;

import java.util.Scanner;

public class CompareWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        if (A > B) System.out.println(">");
        if (A < B) System.out.println("<");
        if (A == B) System.out.println("==");
    }
}
