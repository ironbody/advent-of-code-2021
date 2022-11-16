import java.io.File

object Day2 {
    private const val input = "day2_input.txt"

    fun part1() {
        val instructions = File(input).readLines()
            .map { it.split(" ") }
            .map { Pair(it[0], it[1].toInt()) }

        var depth = 0
        var horizontal = 0
        for ((cmd, n) in instructions) {
            when (cmd) {
                "forward"   -> horizontal += n
                "down"      -> depth += n
                "up"        -> depth -= n
            }
        }
        val result = depth * horizontal
        println(result)
    }

    fun part2() {
        val instructions = File(input).readLines()
            .map { it.split(" ") }
            .map { Pair(it[0], it[1].toInt()) }

        var depth = 0
        var horizontal = 0
        var aim = 0
        for ((cmd, n) in instructions) {
            when (cmd) {
                "forward"   -> {
                    horizontal += n
                    depth += aim * n
                }
                "down"      -> aim += n
                "up"        -> aim -= n
            }
        }
        val result = depth * horizontal
        println(result)
    }

}