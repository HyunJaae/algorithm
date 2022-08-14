package algorithm.programmers.array;

public class LargeNum {

    public static String solution(int[] numbers) {
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                String num = String.valueOf(numbers[i]) + numbers[j];
                System.out.println(num);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        System.out.println(solution(numbers));
    }
}
