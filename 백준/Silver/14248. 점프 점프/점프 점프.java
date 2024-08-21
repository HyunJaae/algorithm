import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stones = new int[n];
        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) stones[i] = Integer.parseInt(strings[i]);
        int s = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[n];
        int[] bias = {1, -1};

        int cnt = 1;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(s - 1);
        visited[s - 1] = true;
        while (!deque.isEmpty()) {
            int q = deque.pop();
            for (int b : bias) {
                int abs = q + stones[q] * b;
                if (0 <= abs && abs < n && !visited[abs]) {
                    visited[abs] = true;
                    cnt++;
                    deque.push(abs);
                }
            }
        }
        System.out.println(cnt);
    }
}