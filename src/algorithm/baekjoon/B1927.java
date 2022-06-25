package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// todo : 최소 힙 (완)
public class B1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heep = new PriorityQueue<>();
        for (int i =0; i < T; i++) {
            int X = Integer.parseInt(br.readLine());

            if(X != 0) {
                heep.add(X);
            } else if(heep.isEmpty()) {
                sb.append(0 + "\n");
            }
            else {
                sb.append(heep.poll()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
