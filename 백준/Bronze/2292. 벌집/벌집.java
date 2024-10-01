import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int k = 1;
        while (k < n) {
            cnt++;
            k += cnt * 6;
        }
        System.out.println(cnt + 1);
    }
}