package algorithm.programmers.hash;

import java.util.ArrayList;
import java.util.HashMap;

// TODO: 실패
public class Camouflage {

    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        System.out.println(map);

        int allSum = 0;
        int allMul = 0;
        int mulNum = 0;

        for (String key : map.keySet()) {
            allSum += map.get(key);
            arr.add(map.get(key));
        }

        if(arr.size() > 1) {
            allMul = 1;
            for (int i = 0; i < arr.size(); i++) {
                allMul *= arr.get(i);
            }
        }

        if(arr.size() > 2) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    mulNum += arr.get(i) * arr.get(j);
                }
            }
        }


        System.out.println("모두 더한 값: " + allSum + "\n모두 곱한 값: " + allMul + "\n각자 곱한 값: " + mulNum);

        answer = allSum + allMul + mulNum;

        return answer;
    }

    public static void main(String[] args) {
        String[][] spy = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"},
                {"red_hat", "headgear"}, {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"white_sunglasses", "eyewear"}};
        String[][] spy00 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] spy01 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(spy));
        System.out.println(solution(spy00));
        System.out.println(solution(spy01));
    }
}
