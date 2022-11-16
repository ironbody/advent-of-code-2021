import java.io.File

object Day3 {
    private const val input = "day3_input.txt"

    fun part1() {
        val nums = File(input).readLines()
        val counts = mutableListOf<IntArray>()

        for (num in nums) {
            for ((index, digit) in num.map { it.digitToInt() }.withIndex()) {
                if (counts.size <= index) {
                    counts.add(IntArray(2))
                }

                counts[index][digit] += 1
            }
        }

        var gammaStr = ""
        for (pair in counts) {
            gammaStr += if (pair[0] > pair[1]) {
                "0"
            } else {
                "1"
            }
        }
        val gamma = gammaStr.toUInt(2)
        val epsilon = gamma.inv() and 4095u
        println(gamma * epsilon)
    }

    fun part2() {
        val nums = File(input).readLines()
        val counts = mutableListOf<IntArray>()

        for (num in nums) {
            for ((index, digit) in num.map { it.digitToInt() }.withIndex()) {
                if (counts.size <= index) {
                    counts.add(IntArray(2))
                }

                counts[index][digit] += 1
            }
        }

    }

}