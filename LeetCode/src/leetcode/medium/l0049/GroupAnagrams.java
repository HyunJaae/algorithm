package leetcode.medium.l0049;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solve(strs));
    }

    public static List<List<String>> solve(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            // 맵에서 키가 존재하면 s 를 기존 리스트에 추가하고 없으면 새 리스트를 생성
            results.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            /* 위와 같은 코드
            if (!results.containsKey(key)) {
                results.put(key, new ArrayList<>());
            }
            results.get(key).add(s);
            */
        }
        return new ArrayList<>(results.values());
    }
}
