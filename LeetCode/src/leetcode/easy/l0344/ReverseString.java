package leetcode.easy.l0344;

public class ReverseString {

    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        reverseString(str);
    }

    private static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }
}
