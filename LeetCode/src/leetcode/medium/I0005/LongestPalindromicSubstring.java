package leetcode.medium.I0005;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String result = longestPalindrome("babad");
        System.out.println(result.equals("bab"));
    }

    private static int size;
    private static int left;

    public static String longestPalindrome(String s) {
        int len = s.length();
        // 길이가 1인 문자는 그대로 반환
        if (len < 2) return s;

        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i + 1); // 2칸짜리 투포인터
            extendPalindrome(s, i, i + 2); // 3칸짜리 투포인터
        }
        return s.substring(left, left + size);
    }

    // 투포인터 양쪽의 문자가 같은 경우, 확장해나가면서 가장 긴 팰린드롬 문자의 인덱스를 구한다.
    private static void extendPalindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        int pSize = end - start - 1;
        if (size < pSize) {
            left = start + 1;
            size = pSize;
        }
    }
}
