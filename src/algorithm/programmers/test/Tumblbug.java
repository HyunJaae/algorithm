package algorithm.programmers.test;

import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class Tumblbug {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.println(c);

            if(c == '0') {
                char beforeCh = s.charAt(i - 1);
                hm.put(String.valueOf(Integer.valueOf(beforeCh + 10)), hm.getOrDefault(beforeCh + "10", 0) + 1);
            } else {
                hm.put(String.valueOf(c), hm.getOrDefault(String.valueOf(c), 0) + 1);
            }
        }
        System.out.println(hm);

        String[][] textDial = {{""}, {".", "Q", "Z"}, {"A", "B", "C"}, {"D", "E", "F"},
                {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"}, {"P", "R", "S"},
                {"T", "U", "V"}, {"W", "X", "Y"}};

        for (String key : hm.keySet()) {
            int index = parseInt(key);
            if(index > 9) {
                int i = index&10;
                answer.append(textDial[i][hm.get(key)]);
            }
            System.out.println(key);
            answer.append(textDial[index][hm.get(key)]);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "44335550555666";
        String s1 = "966677555553";
        String s2 = "222081";

        System.out.println(solution(s));
    }
}
