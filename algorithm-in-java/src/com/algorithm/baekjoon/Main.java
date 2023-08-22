package com.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int inputIndex = 0;
        for (int i = 0; i < 9; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > max) {
                max = input;
                inputIndex = i + 1;
            }
        }
        System.out.println(max + "\n" + inputIndex);
    }
}
