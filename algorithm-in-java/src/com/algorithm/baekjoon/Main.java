package com.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> bucket = IntStream.range(0, n).boxed().collect(Collectors.toMap(i -> i + 1, i -> 0, (a, b) -> b, HashMap::new));

        for(int s = 0; s < m; s++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            IntStream.rangeClosed(i, j).forEach(t -> bucket.put(t, k));
        }
        String sb = bucket.values().stream().mapToInt(value -> value).mapToObj(value -> value + " ").collect(Collectors.joining());

        System.out.println(sb);

    }
}
