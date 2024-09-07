package leetcode.medium.I0005

fun main() {
    println(longestPalindrome("babad"))
}

var left: Int = 0
var size: Int = 0

fun longestPalindrome(str: String): String {
    val len = str.length

    if (len < 2) return str

    for (i in 0 until len - 1) {
        extendPalindrome(str, i, i + 1)
        extendPalindrome(str, i, i + 2)
    }

    return str.substring(left, left + size)
}

fun extendPalindrome(s: String, start: Int, end: Int) {
    var st = start
    var en = end

    while (st >= 0 && en < s.length && s[st] == s[en]) {
        st--
        en++
    }

    val pSize = en - st - 1
    if (size < pSize) {
        left = st + 1
        size = pSize
    }
}