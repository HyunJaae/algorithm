import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * N - 1; i++) {
            int spaces = Math.abs(N - i);
            int stars = 2 * (N - spaces) - 1;

            bw.write(" ".repeat(spaces));
            bw.write("*".repeat(stars));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}