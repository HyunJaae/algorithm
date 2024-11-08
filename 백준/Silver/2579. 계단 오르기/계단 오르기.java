import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }
        if (n == 1) {
            System.out.println(s[1]);
            return;
        }
        int[][] dp = new int[n + 1][3];
        dp[1][1] = s[1];
        dp[1][2] = 0;
        dp[2][1] = s[2];
        dp[2][2] = s[1] + s[2];
        for (int i = 3; i <= n; i++) {
            dp[i][1] = Math.max(dp[i - 2][1], dp[i - 2][2]) + s[i];
            dp[i][2] = dp[i - 1][1] + s[i];
        }
        System.out.println(Math.max(dp[n][1], dp[n][2]));
    }
}