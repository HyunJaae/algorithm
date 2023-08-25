package com.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        Arrays.setAll(arr, i -> i + 1);

        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int iArr = arr[i - 1];
            int jArr = arr[j - 1];
            arr[i - 1] = jArr;
            arr[j - 1] = iArr;
        }
        Arrays.stream(arr).mapToObj(a -> a + " ").forEach(System.out::printf);
    }
}
