class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        char front = ' ';
        for(int i = 0; i < l; i++){
            char c = s.charAt(i);
            if(front == ' '){
                sb.append(String.valueOf(c).toUpperCase());
                front = c;
                continue;
            }
            if(c == ' '){
                sb.append(c);
                front = c;
                continue;
            }
            sb.append(String.valueOf(c).toLowerCase());
            front = c;
        }
        return sb.toString();
    }
}