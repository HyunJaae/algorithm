class Solution {
    public int solution(int n) {
        int x = 1234567;
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fibo[i] = fibo[i - 1] % x + fibo[i - 2] % x;
        }
        return fibo[n] % x;
    }
}