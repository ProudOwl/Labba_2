fun countOddDigitNumbers(nums: List<Int>): Int {
    var count = 0
    for (num in nums) {
        var digits = if (num == 0) 1 else 0
        var n = num
        while (n != 0) {
            n /= 10
            digits++
        }
        if (digits % 2 != 0) {
            count++
        }
    }
    return count
}

fun main() {
    println("Введите числа через запятую: ")
    val input = readLine() ?: ""
    val nums = input.split(",").map { it.trim().toInt() }
    println(countOddDigitNumbers(nums))
}