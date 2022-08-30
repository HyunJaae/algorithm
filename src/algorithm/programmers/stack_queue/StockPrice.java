package algorithm.programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;

public class StockPrice {

    public int[] solution(int[] prices) {

        // 초 단위로 기록된 주식 가격이 담긴 배열
        // 가격이 떨어지지 않은 기간은 몇 초인지를 return
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            int a = prices[i];
            int s = 0;
            for (int j = 1 + i; j < prices.length; j++) {
                if (prices[j] >= a) {
                    s++;
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

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        StockPrice stockPrice = new StockPrice();
        System.out.println(Arrays.toString(stockPrice.solution(prices)));
    }
}
