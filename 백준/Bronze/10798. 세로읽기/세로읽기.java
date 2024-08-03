import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] words = new String[5][15]; // 최대 15개이기 때문에 열의 최대 길이를 15로 설정

        for (int i = 0; i < 5; i++) {
            String[] word = br.readLine().split(""); // 문자 단위로 쪼갠다.
            System.arraycopy(word, 0, words[i], 0, word.length); // 이차원 배열에 쪼갠 문자를 할당한다.
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                String word = words[j][i];
                if (word != null) sb.append(word);
            }
        }

        System.out.println(sb);
	}

}