package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
/*
* Hash 를 사용하여 풀어야 하니 otherSolution 이 맞겠다.
*/
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
        // hashMap 생성
        HashMap<String, Integer> hm = new HashMap<>();
        // getOrDefault 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 default 값을 반환하는 메서드
        // 참가자마다 1씩 더해진다.
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        // 완주자마다 1씩 빠진다. -> 0이 된다.
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        System.out.println(hm.keySet());

        // hashMap 에 있는 모든 키를 뽑아온다.
        for (String key : hm.keySet()) {
            // 뽑은 키 중 0이 아닌(완주가 안된) 키를 answer 에 대입
            if(hm.get(key) != 0) {
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
