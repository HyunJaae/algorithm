package algorithm.programmers.array;

import java.util.ArrayList;
import java.util.Arrays;

public class KstNum {
    // i 번째부터 j 번째까지 자르고 정렬하여 k 번째 수를 담은 배열을 반환한다.
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int y = 0; y < commands.length; y++) {
            int i = commands[y][0];
            int j = commands[y][1];
            int k = commands[y][2];

            int[] arr = new int[j-i];
            System.out.println(j-i);
            System.out.println(k-1);

            for (int u = 0; u < arr.length; u++) {
                arr[u] = array[i-1 + u];
            }
            Arrays.sort(arr);
            list.add(arr[k-1]);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(array, commands);

        for (int j : result) {
            System.out.println(j);
        }
    }
}
