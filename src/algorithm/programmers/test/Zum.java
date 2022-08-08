package algorithm.programmers.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Zum {

    // 임의의 자연수 n으로 나누었을 때, 그 몫과 나머지가 같아지는 자연수들을 모두 더한 값을 반환
    // 몫 == 나머지
    // 나머지는 나누어지는 임의의 자연수보다 클 수 없다.
    public static long solution01(long n) {
        long answer = 0;

        // 나누는 수 n에 몫을 곱하고 나머지를 더하면 나뉜 수가 된다.
        for (int i = 1; i < n; i++) {
            // 곱하는 몫과 나머지를 1부터 같은 수로 연산한다.
            answer += n * i + i;
        }

        return answer;
    }

    // 문서를 한번에 하나씩 인쇄할 수 있는 프린터가 한대있다.
    // 여러 사람이 인쇄할 때는 어떤 문서를 먼저 인쇄할지 정해야 한다.
    // 1. 인쇄 중, 대기 중인 문서가 없을 때 즉시 인쇄
    // 2. 인쇄 중, 대기 중인 문서가 있을 때 대기열에 추가
    // 3. 인쇄 중인 문서가 전부 인쇄된 후 대기열에서 다음 문서를 선택
    // 3-1. 페이지 수가 적은 문서부터 인쇄
    // 3-2. 페이지 수가 같을 경우 먼저 요청된 문서부터 인쇄
    // 3-3. 현재 인쇄 중인 문서의 인쇄가 끝난 시각과 새로 요청된 문서의 인쇄 요청 시각이 같은 경우
    // 새로 요청된 문서를 먼저 대기열에 추가한 후 다음에 인쇄해야 될 문서를 선택
    // 요청 시각이 같은건 없다.
    // [문서 번호, 인쇄 요청 시각(초), 페이지 수(페이지 당 인쇄 시간은 1초)]
    // 인쇄가 완료되는 순서대로 문서 번호를 반환
    public static int[] solution02(int[][] data) {
        int[] answer = new int[data.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            int num = data[i][0];
            int time = data[i][1];
            int page = data[i][2];

            for (int j = i + 1; j < data.length; j++) {
                if (page < data[j][2] && num < data[j][0]) {
                    list.add(num);
                } else if (time + page == data[j][1]) {
                    list.add(Math.min(num, data[j][0]));
                } else {
                    list.add(num);
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static int solution03(int[] histogram) {
        // 가장 큰 수를 우선순위로 합니다.
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // 주어진 배열의 길이만큼 반복합니다.
        for (int i = 0; i < histogram.length; i++) {
            // 바로 다음 막대(+1번째)와는 사이에 채울 공간이 없으므로 +2번째의 막대 사아의 넓이를 구합니다.
            for(int j = i + 2; j < histogram.length; j++) {
                // 작은 막대의 높이를 기준으로 다음 막대와의 간격을 곱하여 넓이를 구합니다.
                if(histogram[i] <= histogram[j]) {
                    queue.add(histogram[i] * (j-1));
                } else {
                    queue.add(histogram[j] * (j-1));
                }
            }
        }
        // NPE 를 방지합니다.
        if(queue.peek() == null) {
            return 0;
        }
        // 가장 높은 수를 반환합니다.
        return queue.peek();
    }

    public static int[] solution04(int[][] grid) {
        int[] answer = {};

        // 세로 마름모 : 세로로 같은게 대각선, 세로가 3보다 작다면 세로 모양의 마름모는 없습니다.
        if(grid[0].length >= 3) {

        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] data = {{1, 0, 5}, {2, 2, 2}, {3, 3, 1}, {4, 4, 1}, {5, 10, 2}};
        int[] histogram = {2, 2, 2, 3};
        int[][] grid = {{2, 1, 1, 3, 5, 1},
                        {1, 1, 3, 3, 5, 5},
                        {8, 3, 3, 3, 1, 5},
                        {3, 3, 3, 4, 4, 4},
                        {3, 3, 4, 4, 4, 4},
                        {1, 4, 4, 4, 4, 4}};
        int[][] grid01 = {{1, 1, 1, 1},
                          {1, 1, 1, 1}};

        System.out.println(solution01(n));
        System.out.println(Arrays.toString(solution02(data)));
        System.out.println(solution03(histogram));
        System.out.println(solution04(grid));
        System.out.println(solution04(grid01));
    }
}
