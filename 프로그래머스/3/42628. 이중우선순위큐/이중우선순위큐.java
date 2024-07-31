import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> asc = new PriorityQueue<>();
        PriorityQueue<Integer> desc = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            if (operation.contains("I")) {
                int num = Integer.parseInt(operation.split(" ")[1]);
                asc.offer(num);
                desc.offer(num);
            }
            if (!desc.isEmpty() && operation.equals("D 1")) {
                asc.remove(desc.poll());
            }
            if (!asc.isEmpty() && operation.equals("D -1")) {
                desc.remove(asc.poll());
            }
        }
        if (desc.isEmpty() || asc.isEmpty()) {
            return new int[]{0, 0};
        }
        return new int[]{desc.peek(), asc.peek()};
    }
}