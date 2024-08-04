import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[20_000_001];
        int n = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(cards[i]) + 10_000_000]++;
        }
        int m = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            sb.append(arr[Integer.parseInt(numbers[i]) + 10_000_000]).append(" ");
        }
        System.out.println(sb);
    }
}