package algorithm.programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StockPrice {

    public int[] solution(int[] prices) {

        // 초 단위로 기록된 주식 가격이 담긴 배열
        // 가격이 떨어지지 않은 기간은 몇 초인지를 return
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            int a = prices[i];
            int s = 0;
            for (int j = 1 + i; j < prices.length; j++) {
                s++;
                if (prices[j] < a) {
                    break;
                }
            }
            list.add(s);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int[] solution00(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        int i;
        int j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }

    public int[] solution01(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }

        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();

        int[] prices = {3, 4, 2, 2, 1};
        String result = Arrays.toString(stockPrice.solution(prices));
        String result00 = Arrays.toString(stockPrice.solution00(prices));
        String result01 = Arrays.toString(stockPrice.solution01(prices));


        System.out.println(result.equals(result00));
        System.out.println(result.equals(result01));
        System.out.println(result01);
    }
}
