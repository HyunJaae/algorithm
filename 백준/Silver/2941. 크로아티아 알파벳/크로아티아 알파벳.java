import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("c=", "0");
        map.put("c-", "1");
        map.put("dz=", "2");
        map.put("d-", "3");
        map.put("lj", "4");
        map.put("nj", "5");
        map.put("s=", "6");
        map.put("z=", "7");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str.replace(entry.getKey(), entry.getValue());
        }

        System.out.println(str.length());
    }
}