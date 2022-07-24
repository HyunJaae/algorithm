package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Phonekemon {
    public static int solution(int[] nums) {
        int answer;

        int getMon = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        answer = Math.min(map.size(), getMon);

        return answer;
    }

    public static int solution01(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        return Math.min(hs.size(), nums.length / 2);
    }

    public static int solution02(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }

    public static void main(String[] args) {
        int[] typeList = {3, 3, 2, 3, 3, 2};

        System.out.println(solution(typeList));
    }
}
