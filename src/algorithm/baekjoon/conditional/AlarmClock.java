package algorithm.baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute - 45 < 0) {
            if (hour != 0) {
                hour--;
            } else {
                hour = 23;
            }
            minute += 15;
        } else {
            minute -= 45;
        }

        sb.append(hour);
        sb.append(" ");
        sb.append(minute);

        System.out.println(sb);
    }
}
