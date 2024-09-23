import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken()); // 10진법 수
        int b = Integer.parseInt(st.nextToken()); // b 진법

        while (n > 0) {
            int r = n % b; // 나머지
            if (r < 10) {
                sb.append(r);
            } else {
                char c = (char) (r + 55);
                sb.append(c);
            }
            n /= b;
        }

        System.out.println(sb.reverse());
    }
}