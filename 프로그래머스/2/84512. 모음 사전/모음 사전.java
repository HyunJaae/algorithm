import java.util.Map;
import java.util.HashMap;

class Solution {
    
    private Map<String, Integer> map = new HashMap<>();
    private int index = 0;
    private boolean isWord = false;
    
    
    public int solution(String word) {
        String[] vowels = {"A", "E", "I", "O", "U"};

        insert(vowels, "", word);

        return map.get(word);
    }
    
    public void insert(String[] vowels, String vowel, String word) {
        map.put(vowel, index++);
        if (vowel.equals(word)) {
            isWord = true;
            return;
        }
        if (vowel.length() == 5 || isWord) return;
        for (int i = 0; i < 5; i++) {
            insert(vowels, vowel + vowels[i], word);
        }
    }
}