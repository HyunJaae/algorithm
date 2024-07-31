import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> asc = new PriorityQueue<>();
        PriorityQueue<Integer> desc = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < operations.length; i++) {
            String[] s = operations[i].split(" ");
            String op = s[0];
            int num = Integer.parseInt(s[1]);
            if (op.equals("I")) {
                asc.offer(num);
                desc.offer(num);
            } else {
                if (desc.size() > 0 && num == 1) {
                    int d = desc.poll();
                    asc.remove(d);
                }
                if (asc.size() > 0 && num == -1) {
                    int a = asc.poll();
                    desc.remove(a);
                }
            }
        }
        if (desc.size() == 0) {
            return new int[]{0, 0};
        }
        return new int[]{desc.peek(), asc.peek()};
    }
}