import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = GCB(A, B); // 최대 공약수
            
            sb.append(A * B / C).append('\n');
        }
        System.out.println(sb);
    }
    public static int GCB(int a, int b) {
        while (b != 0) {
            int r =a % b;  // 16, 12, 4, 0 -> a = 4
            
            a = b;
            b = r;
        }
        return a;
    }
}