import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    static List<Integer>[] relation;
    static boolean[] checked;
    static int res = -1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        relation = new ArrayList[n + 1];
        checked = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            relation[i] = new ArrayList<>();
        }
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            relation[p].add(c);
            relation[c].add(p);
        }
        dfs(x, y, 0);
        System.out.println(res);
    }
    
    public static void dfs(int start, int end, int cnt) {
        if (start == end) {
            res = cnt;
            return;
        }
        checked[start] = true;
        for (int next : relation[start]) {
            if (!checked[next]) {
                dfs(next, end, cnt + 1);
            }
        }
    }
}