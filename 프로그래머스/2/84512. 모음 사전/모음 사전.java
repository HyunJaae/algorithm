import java.util.List;
import java.util.ArrayList;

class Solution {
    
    private List<String> list = new ArrayList<>();
    private boolean isWord = false;
    
    
    public int solution(String word) {

        insert("", word);

        return list.indexOf(word);
    }
    
    public void insert(String vowel, String word) {
        if (vowel.length() > 5 || isWord) return;
        list.add(vowel);
        if (vowel.equals(word)) {
            isWord = true;
            return;
        }
        for (int i = 0; i < 5; i++) insert(vowel + "AEIOU".charAt(i), word);
    }
}