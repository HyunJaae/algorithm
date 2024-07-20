package leetcode.easy.l0819

import java.util.*

fun main() {
    val paragraph = "a, a, a, a, b,b,b,c, c"
    val banned = arrayOf("a")

    println(mostCommonWord(paragraph, banned))
}

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    val counts: MutableMap<String, Int> = mutableMapOf()
    val words = paragraph.replace("\\W+".toRegex(), " ").lowercase(Locale.getDefault()).trim().split(" ")

    for (word in words) {
        if (!banned.contains(word)) {
            counts[word] = counts.getOrDefault(word, 0) + 1
        }
    }

    return counts.maxBy { it.value }!!.key
}