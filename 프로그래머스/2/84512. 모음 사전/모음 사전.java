import java.util.Map;
import java.util.HashMap;

class Solution {
    
    private Map<String, Integer> map = new HashMap<>();
    private int index = 0;
    
    
    public int solution(String word) {
        String[] vowels = {"A", "E", "I", "O", "U"};

        insert(vowels, "");

        return map.get(word);
    }
    
    public void insert(String[] vowels, String vowel) {
        map.put(vowel, index++);
        if (vowel.length() == 5) return;
        for (int i = 0; i < 5; i++) {
            insert(vowels, vowel + vowels[i]);
        }
    }
}