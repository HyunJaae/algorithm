import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String card : cards) set.add(Integer.parseInt(card));
        for (String number : numbers) {
            if (set.contains(Integer.parseInt(number))) sb.append("1").append(" ");
            else sb.append("0").append(" ");
        }

        System.out.println(sb);
    }
}