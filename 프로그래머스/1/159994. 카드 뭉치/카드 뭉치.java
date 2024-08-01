class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cardIdx1 = 0;
        int cardIdx2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            String g = goal[i];
            if (cardIdx1 < cards1.length && g.equals(cards1[cardIdx1])) cardIdx1++;
            else if (cardIdx2 < cards2.length && g.equals(cards2[cardIdx2])) cardIdx2++;
            else return "No";
        }
        
        return answer;
    }
}