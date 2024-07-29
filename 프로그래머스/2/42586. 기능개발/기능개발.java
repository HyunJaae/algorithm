import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> days = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        // 7, 3, 9
        for (int i = 0; i < progresses.length; i++) {
          int v = (int) Math.ceil((100 - (double) progresses[i]) / (double) speeds[i]);
          if (days.peek() != null && days.peek() < v) {
            list.add(days.size());
            days.clear();
          }
          days.offer(v);
        }
        list.add(days.size());
        return list.stream().mapToInt(i -> i).toArray();
    }
}