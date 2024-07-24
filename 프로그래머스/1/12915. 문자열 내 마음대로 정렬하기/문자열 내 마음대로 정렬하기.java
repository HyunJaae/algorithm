import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = Arrays.asList(strings);
        list.sort((o1, o2) -> {
            if (o1.charAt(n) > o2.charAt(n)) return 1;
            else if (o1.charAt(n) < o2.charAt(n)) return -1;
            else {
                return o1.compareTo(o2);
            }
        });
        return list.toArray(new String[0]);
    }
}