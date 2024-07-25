import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int row = 1;
        int col = 1;
        for (int i = 0;  i < 9; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int n = Integer.parseInt(strings[j]);
                if (n > max) {
                    max = n;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.println(max + "\n" + row + " " + col);
    }
}