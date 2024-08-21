import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stones = new int[n];
        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) stones[i] = Integer.parseInt(strings[i]);
        int s = Integer.parseInt(br.readLine());
        dfs(stones, s - 1);
        System.out.println(cnt);
    }

    private static void dfs(int[] stones, int idx) {
        if (stones[idx] == 0) return;
        int left = idx - stones[idx];
        int right = idx + stones[idx];
        stones[idx] = 0;
        cnt++;
        if (left >= 0) dfs(stones, left);
        if (right <= stones.length - 1) dfs(stones, right);
    }
}