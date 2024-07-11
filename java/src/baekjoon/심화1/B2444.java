package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2444 {

    /**
     * 별 찍기 7 - 108ms
     *
     * <pre>
     *     StringBuilder + repeat() 풀이
     *
     *     같은 문자를 여러번 이어 붙인 문자열을 얻고 싶다면 repeat 함수를 사용해보자.
     *     repeat 함수는 System.arraycopy 함수를 사용하는데
     *     JNI(Java Native Interface)로 구현되어 있어
     *     운영체제 수준에서 실행되기 때문에 직접 루프를 통해 구현하는 것보다 빠르다.
     * </pre>
     *
     * @param args args
     * @throws IOException IOException
     * @see <a href="https://www.acmicpc.net/problem/2444">문제 보기</a>
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(n - i - 1));
            sb.append("*".repeat(Math.max(0, 2 * i + 1)));
            sb.append("\n");
        }
        for (int i = n - 1; i > 0; i--) {
            sb.append(" ".repeat(Math.max(0, n - i)));
            sb.append("*".repeat(Math.max(0, 2 * i - 1)));
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // StringBuffer 사용 풀이 - 108ms
    public static void main02(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(n - i - 1));
            sb.append("*".repeat(Math.max(0, 2 * i + 1)));
            sb.append("\n");
        }
        for (int i = n - 1; i > 0; i--) {
            sb.append(" ".repeat(Math.max(0, n - i)));
            sb.append("*".repeat(Math.max(0, 2 * i - 1)));
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // repeat 미사용 풀이 - 120ms
    public static void main01(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = N - 1; i > 0; i--) {
            for (int j = N - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int j = 2 * i - 1; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // StringBuilder 미사용 풀이 - 332ms
    public static void main00(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N - 1; i > 0; i--) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
