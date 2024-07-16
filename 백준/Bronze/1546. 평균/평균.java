import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int maxScore = 0;
        int totalScore = 0;
        for (int i = 0; i < n; ++i) {
            int score = readInt();
            totalScore += score;
            maxScore = Math.max(maxScore, score);
        }
        System.out.println(100.0d * totalScore / maxScore / n);
    }

    static int readInt() throws IOException {
        int retValue = 0;
        boolean negative = false;
        while (true) {
            int i = System.in.read(); // 읽어온 문자의 ASCII 값 저장
            if (i == '\r') continue; // 캐리지 리턴 문자 : windows 시스템에서 발생함
            if (i == ' ' || i == '\n') {
                break;
            } else {
                if (i == '-') negative = true;
                else { // 입력 문자가 숫자라면 문자 '0'의 ASCII 값을 빼서 실제 숫자 값을 얻는다.
                    retValue = retValue * 10 + i - '0'; // 자릿수 추가, 10의 자리
                }
            }
        }
        return negative ? -1 * retValue : retValue;
    }
}