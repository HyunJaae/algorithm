package algorithm.baekjoon;

import java.util.Scanner;

public class  IO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 은 입력한 값을 Byte 단위로 읽는 것을 뜻합니다.
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println((A + B) + "\n" + (A - B) + "\n" + (A * B) + "\n" + (A / B) + "\n" + (A % B));

        sc.close();
    }
}
