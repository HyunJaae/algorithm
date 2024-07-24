import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<String> list = Arrays.asList(strings);
        list.sort(Comparator.comparingInt(o -> o.charAt(n)));
        return list.toArray(new String[0]);
    }
}