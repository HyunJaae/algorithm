import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static int[][] map; // 지도
    static int[] dx = {0, 1, 0, -1}; // 좌하우상
    static int[] dy = {-1, 0, 1, 0}; // 좌하우상
    static int apt = 0; // 단지 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        List<Integer> list = new ArrayList<>();

        // 지도 받기
        for (int i = 0; i < n; i++) {
            String[] p = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(p[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    apt++;
                    list.add(bfs(i, j));
                }
            }
        }

        sb.append(apt).append("\n");
        Collections.sort(list);
        for (Integer i : list) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        map[x][y] = 2;
        int cnt = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int currX = cur[0];
            int currY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = currX + dx[i];
                int ny = currY + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (map[nx][ny] != 1) continue;
                cnt++;
                queue.add(new int[]{nx, ny});
                map[nx][ny] = 2;
            }
        }
        return cnt;
    }
}