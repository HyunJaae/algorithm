import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] words = new String[5][15];
        
        for (int i = 0; i < 5; i++) {
            String[] word = br.readLine().split("");
            for (int j = 0; j < word.length; j++) {
                words[i][j] = word[j];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                String word = words[j][i];
                if (word != null) sb.append(word);
            }
        }
        
        System.out.println(sb.toString());
    }
}