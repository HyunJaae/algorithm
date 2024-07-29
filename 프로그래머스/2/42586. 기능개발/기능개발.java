import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> map = new TreeMap<>();
        int max = 0;
        for (int i = 0; i < progresses.length; i++) {
            int per = 100 - progresses[i];
            int date = 0;
            if (per % speeds[i] == 0) date = per / speeds[i];
            else date = per / speeds[i] + 1;
            
            if (max < date) max = date;
            map.put(max, map.getOrDefault(max, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        return list.stream().mapToInt(i -> i).toArray();
    }
}