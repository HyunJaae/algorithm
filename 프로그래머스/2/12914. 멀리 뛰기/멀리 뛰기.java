class Solution {
    public long solution(int n) {
        if (n < 3) return n;
        int[] jump = new int[n + 1];
        jump[1] = 1;
        jump[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            jump[i] = (jump[i - 1] + jump[i - 2]) % 1234567;
        }
        return (long) jump[n];
    }
}