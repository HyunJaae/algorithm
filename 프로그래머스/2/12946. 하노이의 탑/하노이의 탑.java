import java.util.*;

class Solution {
    
    private List<int[]> arr = new ArrayList<>();
    
    public int[][] solution(int n) {
        int[][] answer = {};
        hanoi(n, 1, 2, 3);
        answer = arr.toArray(new int[0][]);
        return answer;
    }
    
    private void hanoi(int n, int start, int mid, int to) {
        if (n == 1) {
            arr.add(new int[]{start, to});
            return;
        }
        hanoi(n - 1, start, to, mid);
        arr.add(new int[]{start, to});
        hanoi(n - 1, mid, start, to);
    }
}