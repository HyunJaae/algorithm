import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i); // key 에 전화번호를 할당
        }
        for (String s : phoneBook) {
            for (int j = 0; j < s.length(); j++) {
                /*
                전화번호를 문자 단위로 잘라서 맵에 있는지 확인
                j 까지만 잘라서 자기 자신을 비교하지 않도록 함
                */
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }
}