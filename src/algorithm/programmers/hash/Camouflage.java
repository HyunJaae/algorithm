package algorithm.programmers.hash;

import java.util.HashMap;
import java.util.Iterator;

// TODO: 실패
public class Camouflage {
    public static int solution(String[][] clothes) {
        // 1. 옷을 종류별로 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while(it.hasNext()) {
            answer *= it.next() + 1;
            System.out.println(answer);
        }

        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] spy = {{"yellow_hat", "headgear"}, {"green_turban", "headgear"}, {"red_hat", "headgear"},
                          {"crow_mask", "face"}, {"blue_sunglasses", "face"},
                          {"blue_sunglasses", "eyewear"}, {"white_sunglasses", "eyewear"}};
        String[][] spy00 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] spy01 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(spy));
//        System.out.println(solution(spy00));
//        System.out.println(solution(spy01));
    }
}
