class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char prevC = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String convert = prevC == ' ' ? String.valueOf(c).toUpperCase() : String.valueOf(c).toLowerCase();
            answer.append(convert);
            prevC = c;
        }
        return answer.toString();
    }
}