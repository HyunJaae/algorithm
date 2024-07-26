import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        for(int i = 0; i < phoneBook.length - 1; i++) {
            String n = phoneBook[i];
            String nn = phoneBook[i + 1];
            if (nn.length() < n.length()) {
                continue;
            }
            if (nn.substring(0, n.length()).equals(n)) {
                return false;
            }
            
        }
        return true;
    }
}