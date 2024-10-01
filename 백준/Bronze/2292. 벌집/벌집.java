import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int k = 1;
        while (k < n) {
            k += cnt * 6;
            cnt++;
        }
        System.out.println(cnt);
    }
}