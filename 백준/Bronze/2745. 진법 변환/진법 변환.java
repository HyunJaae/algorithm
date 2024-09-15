import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int res = 0;
        int s = 1; // 진법 * 자리수
        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            int v = 'A' <= c && c <= 'Z' ? c - 'A' + 10 : c - '0';
            res += v * s;
            s *= b;
        }

        System.out.println(res);
    }
}