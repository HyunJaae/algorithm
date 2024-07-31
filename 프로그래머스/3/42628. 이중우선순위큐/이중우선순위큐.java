import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
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
                    Iterator<Integer> it = asc.iterator();
                    while(it.hasNext()) {
                        if (it.next() == d) {
                            it.remove();
                            break;
                        }
                    }
                }
                if (asc.size() > 0 && num == -1) {
                    int a = asc.poll();
                    Iterator<Integer> it = desc.iterator();
                    while(it.hasNext()) {
                        if (it.next() == a) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        if (desc.size() == 0) {
            return new int[]{0, 0};
        }
        answer[0] = desc.peek();
        answer[1] = asc.peek();
        return answer;
    }
}