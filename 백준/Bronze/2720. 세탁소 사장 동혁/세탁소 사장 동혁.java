import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int c;
        for (int i = 0; i < t; i++) {
            c = Integer.parseInt(br.readLine());
            sb.append(c / 25).append(" ");
            c = c % 25;
            sb.append(c / 10).append(" ");
            c = c % 10;
            sb.append(c / 5).append(" ");
            c = c % 5;
            sb.append(c).append("\n");
        }

        System.out.println(sb);
    }
}