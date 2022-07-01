package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

// TODO: 실패
public class PhoneBook {
    public static boolean solution(String[] phoneBook) {
        boolean answer = true;
        HashMap<String, Integer> hm = new HashMap<>();
        String word;
        int i;

        for (String phoneNum : phoneBook) {
            for (i = 0; i < phoneNum.length() - 1; i++) {
                word = phoneNum.substring(0, i);
                hm.put(word, hm.getOrDefault(word, 0) + 1);
            }
        }
        for (String key : hm.keySet()) {
            if (hm.get(key) != 1) {
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

    public boolean solution01(String[] phoneBook) {
        boolean answer = true;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }


        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 0; j < phoneBook[i].length(); j++) {
                if (map.containsKey(phoneBook[i].substring(0, j))) {
                    answer = false;
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phoneBook = {"119", "11874223", "1195524421"};

        System.out.println(solution00(phoneBook));
    }
}
