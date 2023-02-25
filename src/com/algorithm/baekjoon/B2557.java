package com.algorithm.baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Hello World!를 출력해보자
 * @author devlee
 */
public class B2557 {
    /**
     * 기본 출력
     * <p>System.out.println, print, printf 를 이용하여 출력한다.</p>
     * @param args
     */
    public static void main00(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello World!");
        System.out.printf("%s", "Hello World!");
    }

    /**
     * BufferedWriter 를 이용한 출력
     * @param args
     * @throws IOException
     */
    public static void main01(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");
        bw.flush();
        bw.close();
    }

    /**
     * StringBuilder 를 이용한 출력
     * @param args
     */
    public static void main02(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!");

        System.out.println(sb);
    }

    /**
     * StringBuffer 를 이용한 출력
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World!");

        System.out.println(sb);
    }
}
