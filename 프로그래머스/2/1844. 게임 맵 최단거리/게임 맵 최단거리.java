import java.util.Queue;
import java.util.LinkedList;

class Solution {
    
    private int[] dx = {0, 0, 1, -1};
    private int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int px = p[0];
            int py = p[1];
            int k = p[2];
            if (visited[px][py]) continue;
            if (px == n - 1 && py == m - 1) {
                return k;
            }
            visited[px][py] = true;
            for (int i = 0; i < 4; i++) {
                int x = px + dx[i];
                int y = py + dy[i];
                
                if (x >= 0 && y >= 0 && x < n && y < m && !visited[x][y] && maps[x][y] != 0) {
                    q.add(new int[]{x, y, k + 1});
                }
            }
        }
        return answer;
    }
}