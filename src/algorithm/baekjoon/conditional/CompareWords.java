package algorithm.baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CompareWords {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        if (A > B) System.out.println(">");
        if (A < B) System.out.println("<");
        if (A == B) System.out.println("==");

        System.out.println((A > B) ? ">" : ((A < B) ? "<" : "=="));

        // BufferedReader 를 이용한 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. StringTokenizer 클래스를 이용하여 분리
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A0 = Integer.parseInt(st.nextToken());
        int B0 = Integer.parseInt(st.nextToken());

        System.out.println((A0 > B0) ? ">" : ((A0 < B0) ? "<" : "=="));
        // 2. split() 을 이용하여 분리
        String[] str = br.readLine().split(" ");
        int A1 = Integer.parseInt(str[0]);
        int B1 = Integer.parseInt(str[1]);

        System.out.println((A1 > B1) ? ">" : ((A1 < B1) ? "<" : "=="));
    }
}
