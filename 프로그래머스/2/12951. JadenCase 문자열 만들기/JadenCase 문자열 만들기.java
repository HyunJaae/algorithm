class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char prevC = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                if (prevC == ' ') {
                    answer.append(String.valueOf(c).toUpperCase());
                    prevC = c;
                } else {
                    answer.append(String.valueOf(c).toLowerCase());
                }
            } else {
                answer.append(c);
                prevC = c;
            }
        }
        return answer.toString();
    }
}