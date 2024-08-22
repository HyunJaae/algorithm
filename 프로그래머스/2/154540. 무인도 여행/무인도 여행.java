import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int row = maps.length;
        int col = maps[0].length();
        int[][] pos = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int[][] ms = new int[row][col];
        for (int i = 0; i < row; i++) {
            char[] m = maps[i].toCharArray();
            for (int j = 0; j < col; j++) {
                ms[i][j] = m[j] == 'X' ? 0 : m[j] - '0';
            }
        }
        boolean[][] visited = new boolean[row][col];
        
        List<Integer> foods = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (visited[i][j] || ms[i][j] == 0) continue;
                Deque<Integer[]> dq = new ArrayDeque<>();
                dq.add(new Integer[]{i, j});
                int cnt = 0;
                while (!dq.isEmpty()) {
                    Integer[] l = dq.pop();
                    int lr = l[0];
                    int lc = l[1];
                    visited[lr][lc] = true;
                    cnt += ms[lr][lc];
                    for (int[] p : pos) { // 상하좌우 순회
                        int r = p[0] + lr;
                        int c = p[1] + lc;
                        if (r >= 0 && r < row &&
                            c >= 0 && c < col &&
                            !visited[r][c]) {
                            visited[r][c] = true;
                            if (ms[r][c] == 0) continue;
                            dq.add(new Integer[]{r, c});
                        }
                    }
                }
                if (cnt != 0) foods.add(cnt);
            }
        }
        if (foods.isEmpty()) return new int[]{-1};
        Collections.sort(foods);
        int[] answer = new int[foods.size()];
        for (int i = 0; i < foods.size(); i++) answer[i] = foods.get(i);
        return answer;
    }
}