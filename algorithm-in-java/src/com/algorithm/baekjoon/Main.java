package com.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int input = Integer.parseInt(br.readLine());
            list.add(input);
        }
        int max = Collections.max(list);
        int inputIndex = list.indexOf(max) + 1;
        System.out.println(max);
        System.out.println(inputIndex);
    }
}
