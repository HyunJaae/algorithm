package algorithm.baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExScore {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int exScore = sc.nextInt();

        String result = (exScore >= 90) ? "A" : ((exScore >= 80) ? "B" : ((exScore >= 70) ? "C" : ((exScore >= 60) ? "D" : "F")));
        String other = (exScore>=90)?"A": (exScore>=80)?"B": (exScore>=70)?"C": (exScore>=60)?"D": "F";

        System.out.println(result);
        System.out.println(other);
        // BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        sc.close();

        System.out.println((score>=90)?"A": (score>=80)?"B": (score>=70)?"C": (score>=60)?"D": "F");

    }
}
