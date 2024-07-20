package leetcode.easy.l0125

fun main() {
    println("A man, a plan, a canal: Panama -> " + validPalindrome("A man, a plan, a canal: Panama"))
    println("race a car -> " + validPalindrome("race a car"))
}

fun validPalindrome(s: String): Boolean {
    var start = 0
    var end = s.length - 1

    while(start < end) {
        when {
            !Character.isLetterOrDigit(s[start]) -> start++
            !Character.isLetterOrDigit(s[end]) -> end--
            else -> {
                if (Character.toLowerCase(s[start]) != Character.toLowerCase(s[end])) {
                    return false
                }
                start++
                end--
            }
        }
    }
    return true
}