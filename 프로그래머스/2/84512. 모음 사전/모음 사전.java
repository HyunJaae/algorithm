import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String word) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = {"A", "E", "I", "O", "U"};
        int index = 1;
        for (int i = 0; i < 5; i++) {
            map.put(arr[i], index++);
            for (int j = 0; j < 5; j++) {
                map.put(arr[i] + arr[j], index++);
                for (int k = 0; k < 5; k++) {
                    map.put(arr[i] + arr[j] + arr[k], index++);
                    for (int o = 0; o < 5; o++) {
                        map.put(arr[i] + arr[j] + arr[k] + arr[o], index++);
                        for (int p = 0; p < 5; p++) {
                            map.put(arr[i] + arr[j] + arr[k] + arr[o] + arr[p], index++);
                        }
                    }
                }
            }
        }
        
        return map.get(word);
    }
}