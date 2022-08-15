package algorithm.programmers.array;

import java.util.Arrays;

public class HIndex {
    public static int solution(int[] citations) {
        int answer = 0;
        // 논문 n 편 중, h 번 이상 인용된 논문이 h 편 이상이고 나머지 논문이 h 번 이하 인용되었다면 h의 최댓 값
        // 논문의 인용 횟수를 담은 배열
        Arrays.sort(citations);
//        0, 1, 3, 5, 6
//        0, 2, 5, 6, 7, 8
//        1, 1, 1, 1, 1, 3, 4
//        9, 9, 9, 12, 17
        for (int i = 0; i < citations.length; i++) {
            int a = citations.length - i;

            if (a > citations[i]) {
                answer = a;
            }

        }

        return answer;
    }

    public static int solution00(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int[] citations00 = {8, 7, 2, 0, 5, 6};
        int[] citations01 = {1, 1, 1, 3, 1, 1, 6};
        int[] citations02 = {9, 9, 9, 12, 17};

        System.out.println(solution(citations));
        System.out.println(solution(citations00));
        System.out.println(solution(citations01));
        System.out.println(solution(citations02));

        System.out.println("solution00: " + solution00(citations));
        System.out.println("solution00: " + solution00(citations00));
        System.out.println("solution00: " + solution00(citations01));
        System.out.println("solution00: " + solution00(citations02));
    }
}
