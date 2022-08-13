package algorithm.programmers.array;

import java.util.Arrays;

public class KstNum {
    // i 번째부터 j 번째까지 자르고 정렬하여 k 번째 수를 담은 배열을 반환한다.
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int y = 0; y < commands.length; y++) {
            int i = commands[y][0];
            int j = commands[y][1];
            int k = commands[y][2];
            int v = j-i + 1;

            int[] arr = new int[v];

            // array 배열의 srcPos 번째 값부터 arr 배열의 destPos 번째에서 arr.length 길이만큼 차례로 복사
//            System.arraycopy(array, i - 1, arr, 0, arr.length);
            for (int u = 0; u < arr.length; u++) {
                arr[u] = array[i - 1 + u];
            }
            Arrays.sort(arr);
            answer[y] = arr[k-1];
        }

        return answer;
    }

    public static int[] solution00(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            // Arrays.copyOfRange() : 특정 배열의 원하는 범위만큼 복사하여 새로운 배열을 만드는 메소드
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(array, commands);

        for (int j : result) {
            System.out.println("result : " + j);
        }
    }
}
