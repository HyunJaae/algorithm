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
        int[] dp = new int[n + 1];
        dp[1] = s[1];
        if (1 < n) {
            dp[2] = dp[1] + s[2];
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + s[i - 1]) + s[i];
        }
        System.out.println(dp[n]);
    }
}