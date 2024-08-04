import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String n = br.readLine();
        String[] cards = br.readLine().split(" ");
        for (String card : cards) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        String m = br.readLine();
        String[] numbers = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            if (map.containsKey(number)) sb.append(map.get(number)).append(" ");
            else sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}