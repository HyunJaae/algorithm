class Solution {
    
    private int cnt = 0;
    private int[] sign = {1, -1};
    
    public int solution(int[] numbers, int target) {
        int len = numbers.length;
        dfs(numbers, 0, 0, len, target);
        return cnt;
    }
    
    private void dfs(int[] numbers, int depth, int ret, int len, int target) {
        if (depth == len) {
            if (ret == target) cnt++;
            return;
        }
        
        for (int s : sign) {
            int result = ret + numbers[depth] * s;
            dfs(numbers, depth + 1, result, len, target);
        }
        
    }
}