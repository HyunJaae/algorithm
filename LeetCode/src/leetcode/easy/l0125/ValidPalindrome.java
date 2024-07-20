package leetcode.easy.l0125;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println("A man, a plan, a canal: Panama -> " + validPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("race a car -> " + validPalindrome("race a car"));
    }

    private static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
