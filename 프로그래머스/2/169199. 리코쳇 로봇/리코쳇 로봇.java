import java.util.*;

class Solution {
    public int solution(String[] board) {
        int answer = -1;
        int row = board.length;
        int col = board[0].length();
        char[][] map = new char[row][col];
        int[] start = new int[3];
        for (int i = 0; i < row; i++) {
            char[] c = board[i].toCharArray();
            for (int j = 0; j < col; j++) {
                if (c[j] == 'R') start = new int[]{i, j, -1};
                map[i][j] = c[j];
            }
        }
        int[][] pos = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Deque<int[]> deque = new ArrayDeque<>();
        boolean[][] visited = new boolean[row][col];
        deque.add(start);
        while(!deque.isEmpty()) {
            int[] d = deque.pop();
            int r = d[0]; // 행
            int c = d[1]; // 열
            int m = d[2] + 1; // 이동 횟수
            
            if (map[r][c] == 'G') {
                if (answer == -1 || answer > m) {
                    answer = m;
                }
                break;
            }
            if (visited[r][c]) continue;
            visited[r][c] = true;
            
            for (int[] p : pos) {
                int x = r + p[0];
                int y = c + p[1];
                
                while(x >= 0 && y >= 0 && x < row && y < col && map[x][y] != 'D') {
                    x += p[0];
                    y += p[1];
                }
                
                x -= p[0];
                y -= p[1];
                if (visited[x][y] || r == x && c == y) continue;
                deque.add(new int[]{x, y, m});
            }
        }
        return answer;
    }
}