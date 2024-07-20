package leetcode.easy.l0344

fun main() {
    val string: CharArray = charArrayOf('h', 'e', 'l', 'l', 'o')
    reverseString(string)
}

fun reverseString(s: CharArray): Unit {
    var start = 0
    var end = s.size - 1

    while(start < end) {
        s[start] = s[end].also { s[end] = s[start] }

        start++
        end--
    }

    println(s)
}