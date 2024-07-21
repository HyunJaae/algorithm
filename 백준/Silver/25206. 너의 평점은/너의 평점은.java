import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalCredit = 0.0;
        double creditMultiplyGPA = 0.0;
        for (int i = 0; i < 20; i++) {
            String[] transcript = br.readLine().split(" ");
            double credit = Double.parseDouble(transcript[1]);
            String grade = transcript[2];
            if (map.get(grade) == null) continue;
            totalCredit += credit;
            creditMultiplyGPA += credit * map.get(grade);
        }

        if (totalCredit == 0) {
            System.out.println(0.0000);
        } else {
            System.out.println(creditMultiplyGPA / totalCredit);
        }
    }
}