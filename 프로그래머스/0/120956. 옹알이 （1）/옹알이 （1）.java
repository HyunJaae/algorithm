class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String word : words) {
            for (int i = 0; i < babbling.length; i++) {
                babbling[i] = babbling[i].replaceAll(word, " ");
            }
        }
        int answer = 0;
        for (String b : babbling) {
            if (b.isBlank()) answer++;
        }
        return answer;
    }
}