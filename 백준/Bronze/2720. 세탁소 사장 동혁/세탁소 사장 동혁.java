import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = {25, 10, 5, 1};

        StringBuilder sb = new StringBuilder();
        int c;
        for (int i = 0; i < t; i++) {
            c = Integer.parseInt(br.readLine());
            for (int k : arr) {
                sb.append(c / k).append(" ");
                c = c % k;
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}