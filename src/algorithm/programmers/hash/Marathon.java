package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant); // 배열 오름차순
        Arrays.sort(completion);
        int i = 0;
        for(String winner : completion) {
                if(!winner.equals(participant[i])) {
                    answer = participant[i];
                    return answer;
                }
            i++;
        }
        answer = participant[i];
        return answer;
    }
    public String otherSolution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }
}
