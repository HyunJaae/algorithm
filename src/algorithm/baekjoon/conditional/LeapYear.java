package algorithm.baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        int result = ((year%4) == 0 && (year%100) != 0) ? 1 : ((year%400) == 0)? 1 : 0;

        System.out.println(result);
    }
}
