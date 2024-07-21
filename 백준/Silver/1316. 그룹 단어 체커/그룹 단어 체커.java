import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr;
        int cnt = 0; // 그룹 단어 개수
        for (int i = 0; i < n; i++) {
            arr = new int[26]; // 알파벳 개수와 동일한 크기의 배열 선언
            char[] s = br.readLine().toCharArray(); // 입력 문자를 문자 배열로 변환
            char c = s[0]; // 직전 읽은 문자
            boolean isGroupWord = true; // 그룹 단어 유무
            for (char value : s) {
                if (value == c || arr[value - 'a'] == 0) {
                    c = value;
                    arr[value - 'a']++;
                    continue;
                }
                isGroupWord = false;
            }
            if (isGroupWord) cnt++;
        }
        System.out.println(cnt);
    }
}