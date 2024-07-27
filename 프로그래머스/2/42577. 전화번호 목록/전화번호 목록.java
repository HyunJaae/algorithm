import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        Collections.addAll(set, phoneBook);
        for (String s : phoneBook) {
            for (int j = 0; j < s.length(); j++) {
                /*
                전화번호를 문자 단위로 잘라서 set 에 있는지 확인
                j 까지만 잘라서 자기 자신을 비교하지 않도록 함
                */
                if (set.contains(s.substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }
}