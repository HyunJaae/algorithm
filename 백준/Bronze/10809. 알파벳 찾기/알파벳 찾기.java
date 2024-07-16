import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) arr[i] = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int j = c - 'a';
            if (arr[j] == -1) arr[j] = i;
        }

        for (int a : arr) System.out.print(a + " ");
    }
}