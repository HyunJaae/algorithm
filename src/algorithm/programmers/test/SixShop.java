package algorithm.programmers.test;

import java.util.Arrays;
import java.util.HashMap;

public class SixShop {
    public static int userCnt(int[] estimates, int k) {
        int answer;
        int[] userCntArr = new int[estimates.length];
        for (int i = 0; i <= estimates.length - k; i++) {
            int userCnt = 0;
            for(int j = i; j < i + k; j++) {
                userCnt += estimates[j];
            }
            System.out.println(userCnt);
            userCntArr[i] = userCnt;
        }
        Arrays.sort(userCntArr);
        answer = userCntArr[userCntArr.length-1];
        return answer;
    }

    public static int ranking(int K, String[] user_scores) {
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<>();

        for (String userScore : user_scores) {
            String[] arr = userScore.split(" ");
            System.out.println("user: " + arr[0] + "\n" + "score: " + arr[1]);

            if (hm.getOrDefault(arr[0], 0) < Integer.parseInt(arr[1])) {
                hm.put(arr[0], Integer.valueOf(arr[1]));
            }
        }

        if(hm.size() > K) {
            System.out.println("페이지 표시 수보다 유저 수가 더 크다.");
            int i = 0;
            int[] scoreArr = new int[hm.size()];
            for (String key : hm.keySet()) {
                System.out.println("hm key : " + hm.get(key));
                scoreArr[i] = hm.get(key);
                i++;
            }
            for (int j : scoreArr) {
                for (int k : scoreArr) {
                    if (j > k) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] test = {10, 1, 10, 1, 1, 4, 3, 10};
        int k = 6;

        String[] user_scores = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};

//        System.out.println(userCnt(test, k));
        System.out.println(ranking(3, user_scores));
    }
}
