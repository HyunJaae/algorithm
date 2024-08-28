import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int k;
    static boolean[] visited = new boolean[10];
    static char[] arr;
    static List<String> list =  new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new char[k];

        for (int i = 0; i < k; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        dfs(0, "");
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));
    }

    private static void dfs(int i, String result) {
        if (i == k + 1) {
            list.add(result);
            return;
        }

        for (int j = 0; j < 10; j++) {
            if (visited[j]) continue;
            if (i == 0 || checkedNumber(i, j, result)) {
                visited[j] = true;
                dfs(i + 1, result + j);
                visited[j] = false;
            }
        }
    }

    private static boolean checkedNumber(int i, int j, String result) {
        int current = result.charAt(i - 1) - '0';
        if (arr[i - 1] == '>') {
            return current > j;
        } else {
            return current < j;
        }
    }
}