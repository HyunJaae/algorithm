import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()); // 10진법 수
        int B = Integer.parseInt(st.nextToken()); // B 진법

        Deque<Integer> stack = new ArrayDeque<>();
        int q = N; // 몫
        while (q >= B) {
            int r = q % B; // 나머지
            stack.push(r);
            q /= B;
        }

        if (q > 9) {
            char c = (char) (q - 10 + 'A');
            sb.append(c);
        } else {
            sb.append(q);
        }

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            int s = stack.pop();
            if (s > 9) {
                char c = (char) (s - 10 + 'A');
                sb.append(c);
            } else {
                sb.append(s);
            }
        }

        System.out.println(sb);
    }
}