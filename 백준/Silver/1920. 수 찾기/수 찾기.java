import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int m = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(str1[i]);
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == t) {
                    sb.append(1).append('\n');
                    break;
                }
                if (arr[mid] < t) start = mid + 1;
                if (arr[mid] > t) end = mid - 1;
            }
            if (start > end) sb.append(0).append('\n');
        }
        System.out.println(sb);
    }
}