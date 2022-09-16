package algorithm.baekjoon;

import java.util.Scanner;

public class  IO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int piece : chess) {
            int wp = sc.nextInt();
            if (piece != wp) {
                sb.append(piece - wp);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
