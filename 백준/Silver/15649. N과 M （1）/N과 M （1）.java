import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static char[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new char[m * 2];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            result[i * 2 + 1] = ' ';
        }
        result[m * 2 - 1] = '\n';

        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == m) {
            sb.append(result);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                result[depth * 2] = (char) (i + '0');
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}