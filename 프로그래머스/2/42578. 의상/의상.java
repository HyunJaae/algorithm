import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 옷을 종류별로 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        int answer = 1;
        for(int value : map.values()) {
            answer *= value + 1;
        }

        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }
}