import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr = new int[26];
            char[] s = br.readLine().toCharArray();
            char c = s[0];
            boolean isSequence = true;
            for (char value : s) {
                if (value != c && arr[value - 'a'] != 0) {
                    isSequence = false;
                    break;
                } else {
                    c = value;
                    arr[value - 'a']++;
                }
            }
            if (isSequence) cnt++;
        }
        System.out.println(cnt);
    }
}