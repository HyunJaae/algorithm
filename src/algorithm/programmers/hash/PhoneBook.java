package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
// TODO: 실패
public class PhoneBook {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> hm = new HashMap<>();

        for(String phoneNum : phone_book) {
            String word = phoneNum.substring(0, 4);
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        for (String key : hm.keySet()) {
            if(hm.get(key) != 1) {
                answer = false;
            }
        }
        return answer;
    }

    public static boolean solution00(String[] phoneBook) {
        // 1. phoneBook 을 sorting 한다.
        Arrays.sort(phoneBook);
        for (String phone : phoneBook) System.out.println(phone);

        // 2. 1중 Loop 을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phoneBook.length - 1; i++)
            if (phoneBook[i + 1].startsWith(phoneBook[i]))
                return false;

        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }

    public static void main(String[] args) {
        String[] phoneBook = {"119", "11874223", "1195524421"};

        System.out.println(solution00(phoneBook));
    }
}
