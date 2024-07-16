import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heep = new PriorityQueue<>(Collections.reverseOrder());
        for (int i =0; i < T; i++) {
            int X = Integer.parseInt(br.readLine());

            if(X != 0) {
                heep.add(X);
            } else if(heep.isEmpty()) {
                sb.append(0 + "\n");
            }
            else {
                sb.append(heep.poll() + "\n");
            }
        }
        System.out.println(sb);
    }
}