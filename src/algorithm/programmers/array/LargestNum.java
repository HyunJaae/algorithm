package algorithm.programmers.array;

import java.util.Arrays;

public class LargestNum {

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        // 내림차순 정렬
        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (str[0].equals("0")) return "0";

        for (String s : str) {
            System.out.println(s);
            answer.append(s);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        int[] numbers00 = {3, 30, 34, 5, 9};

        System.out.println("첫번째 결과 값 : " + solution(numbers));
        System.out.println("두번째 결과 값 : " + solution(numbers00));
    }
}
