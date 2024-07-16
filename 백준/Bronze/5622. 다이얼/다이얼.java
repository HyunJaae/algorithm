import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        String[] arr = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int result = 0;
        for (String s : input) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains(s)) {
                    result += i;
                }
            }
        }
        System.out.println(result);
    }
}