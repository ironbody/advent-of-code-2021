import java.io.File

object Day1 {
    private const val input = "day1_input.txt"

    fun part1() {
        val depths = File(input).readLines().map { it.toInt() }

        var changes = 0
        var prev = -1
        for (depth in depths) {
            if (depth > prev && prev != -1) {
                changes += 1
            }
            prev = depth
        }
        println(changes)
    }

    fun part2() {
        val depths = File(input).readLines().map { it.toInt() }

        var changes = 0
        var prev = -1
        for (i in depths.indices) {
            if (i + 2 > depths.lastIndex) {
                break
            }
            val depth = depths[i] + depths[i + 1] + depths[i + 2]
            if (depth > prev && prev != -1) {
                changes += 1
            }
            prev = depth
        }
        println(changes)
    }
}