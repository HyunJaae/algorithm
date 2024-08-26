import java.util.Queue;
import java.util.LinkedList;

class Solution {
    
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        while (!queue.isEmpty()) {
            int[] peice = queue.poll();
            int x = peice[0];
            int y = peice[1];
            int distance = peice[2];
            
            if (x == n - 1 && y == m - 1) {
                return distance;
            }
            
            for (int[] dir : directions) {
                int dx = x + dir[0];
                int dy = y + dir[1];
                
                if (dx >= 0 && dy >= 0 && dx < n && dy < m && maps[dx][dy] != 0) {
                    queue.add(new int[]{dx, dy, distance + 1});
                    maps[dx][dy] = 0;
                }
            }
        }
        return answer;
    }
}