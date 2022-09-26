package algorithm.baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int duck = Integer.parseInt(br.readLine());

        if (m + duck >= 60) {
            h += (m + duck) / 60;
            if (h == 24) h = 0;
            if (h > 24) h = h - 24;
            m = (m + duck) % 60;
        } else {
            m += duck;
        }

        sb.append(h).append(" ");
        sb.append(m);

        System.out.println(sb);
    }
}
