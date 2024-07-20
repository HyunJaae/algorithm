package leetcode.medium.l0937;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderDataInLogFiles {

    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] expected = {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"};
        String[] result = reorderLogFiles(logs);
        System.out.println(Arrays.equals(result, expected));
    }

    private static String[] reorderLogFiles(String[] logs) {
        // 문자 로그를 저장할 문자 리스트
        List<String> letters = new ArrayList<>();
        // 숫자 로그를 저장할 숫자 리스트
        List<String> digits = new ArrayList<>();

        for (String log : logs) {
            String[] words = log.split(" ");
            // 로그 종류 확인 후 문자 로그라면 문자 리스트에 삽입
            if (Character.isLetter(words[1].charAt(0))) {
                letters.add(log);
            } else { // 숫자 리스트에 삽입
                digits.add(log);
            }
        }

        // 문자 리스트 정렬
        letters.sort((s1, s2) -> {
            // 식별자와 식별자 외 나머지 부분, 이렇게 두 부분으로 나눈다.
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            // 문자 로그 사전순 비교
            int compared = s1x[1].compareTo(s2x[1]);
            // 문자가 동일한 경우, 식별자 비교
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                // 비교 대상의 순서가 동일한 경우 0, 순서가 앞인 경우 1, 순서가 뒤인 경우 -1이 된다.
                return compared;
            }
        });
        // 문자 리스트 뒤로 숫자 리스트를 이어 붙인다.
        letters.addAll(digits);
        // 리스트를 String 배열로 변환하여 리턴한다.
        return letters.toArray(new String[0]);
    }
}
