package algorithm.programmers.hash;

import java.util.HashMap;
import java.util.Iterator;

// TODO: 실패
public class Camouflage {

    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            hm.put(type, hm.getOrDefault(type, 0));
        }
        // 1개씩 + 2개씩 + 3개씩 ... > 안겹칠 때
        // 1개씩 + 2개씩 -1 + 3개씩 -(n-2) + 4개씩 -(n-2) ... n개씩 -(n-2) > 겹치는게 2개 있을 때 = t = 2
        // 1개씩 + 2개씩 -()
        answer = hm.size();
        return answer;
    }

    public static int solution01(String[][] clothes) {
        // 1. 옷을 종류별로 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
            System.out.println("HashMap 값: " + map);
        }

        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while (it.hasNext())
            answer *= it.next() + 1;

        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] spy = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] spy00 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution01(spy));
        System.out.println(solution01(spy00));
    }
}
