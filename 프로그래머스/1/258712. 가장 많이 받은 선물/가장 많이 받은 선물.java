import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int[] giftRate = new int[friends.length]; // 선물 지수
        for (int i = 0; i < friends.length; i++) {
            int give = 0;
            int take = 0;
            for (String gift : gifts) {
                String[] rel = gift.split(" ");
                String friend = friends[i];
                if (rel[0].equals(friend)) give++;
                if (rel[1].equals(friend)) take++;
            }
            giftRate[i] = give - take;
        }

        int[][] giveAndTake = new int[friends.length][friends.length];
        for (String gift : gifts) {
            String[] rel = gift.split(" ");
            int row = 0;
            int col = 0;
            for (int j = 0; j < friends.length; j++) {
                if (rel[0].equals(friends[j])) row = j;
                if (rel[1].equals(friends[j])) col = j;
            }
            giveAndTake[row][col]++;
        }

        int[] takeGift = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            for (int j = i; j < friends.length; j++) {
                if (i == j) continue;
                int give = giveAndTake[i][j];
                int take = giveAndTake[j][i];

                if (give > take) takeGift[i]++;
                else if (give < take) takeGift[j]++;
                else {
                    if (giftRate[i] > giftRate[j]) takeGift[i]++;
                    else if (giftRate[i] < giftRate[j]) takeGift[j]++;
                }
            }
        }
        Arrays.sort(takeGift);
        
        answer = takeGift[friends.length - 1];
        return answer;
    }
}