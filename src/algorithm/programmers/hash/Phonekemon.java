package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class Phonekemon {
    public static int solution(int[] nums) {
        int answer = 0;
        // nums 갯수 절반 크기로 인덱스 값이 겹치지 않게 뽑는다.
        // 뽑은 값을 키 값으로 갖게 한다.
        // 뽑은 값이 같다면 밸류에 +1
        int getMon = nums.length/2;
        int[] arr = new int[getMon];

        HashMap<Arrays, Integer> map = new HashMap<>();

        for (int i = 0; i < )
        return answer;
    }

    public static void main(String[] args) {
        int[] typeList = {3, 1, 2, 3};

        System.out.println(solution(typeList));
    }
}
