package algorithm.programmers.hash;

import java.util.HashMap;

// TODO: 실패
public class Camouflage {

    public static int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();

        return answer;
    }

    public static void main(String[] args) {
        String[][] spy = {{"yellow_hat", "headgear"}, {"green_turban", "headgear"}, {"red_hat", "headgear"},
                          {"crow_mask", "face"}, {"blue_sunglasses", "face"},
                          {"blue_sunglasses", "eyewear"}, {"white_sunglasses", "eyewear"}};
        String[][] spy00 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] spy01 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(spy));
        System.out.println(solution(spy00));
        System.out.println(solution(spy01));
    }
}
