import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char[] str = br.readLine().toCharArray();
            sb.append(str[0]).append(str[str.length - 1]).append('\n');
        }
        System.out.println(sb);
    }
}