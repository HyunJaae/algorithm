package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  IO{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // System.in 은 입력한 값을 Byte 단위로 읽는 것을 뜻합니다.

        String id = br.readLine();

        System.out.println(id + "??!");
    }
}
