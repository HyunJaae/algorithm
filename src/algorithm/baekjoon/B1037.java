package algorithm.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// todo: 약수 (완)
public class B1037 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            arr.add(A);
        }
        Collections.sort(arr);
        int a = arr.get(0);
        int b = arr.get(T-1);
        sb.append(a*b);
        System.out.println(sb);
    }
}


