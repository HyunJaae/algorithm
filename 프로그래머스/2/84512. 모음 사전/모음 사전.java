import java.util.Map;
import java.util.HashMap;

class Solution {
    
    private Map<String, Integer> map = new HashMap<>();
    private int index = 0;
    
    
    public int solution(String word) {
        String[] vowels = {"A", "E", "I", "O", "U"};
        
        for (int i = 0; i < 5; i++) {
            insert(vowels, "", i);
        }
        
        return map.get(word);
    }
    
    public void insert(String[] vowels, String vowel, int depth) {
        if (vowel.length() == 5) return;
        String word = vowel + vowels[depth]; // "A" -> "AA" -> "AAA" ... -> "AAAAA" -> "AAAAE"
        index++;
        map.put(word, index);
        for (int i = 0; i < 5; i++) {
            insert(vowels, word, i); // "A", 0 -> "AA", 0 ... "AAAA", 1
        }
    }
}