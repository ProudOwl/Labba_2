fun sumAndProductOfDigits(n: Int): Pair<Int, Int> {
    var sum = 0
    var product = 1
    var num = n
    while (num > 0) {
        val digit = num % 10
        sum += digit
        product *= digit
        num /= 10
    }
    return Pair(sum, product)
}

fun main() {
    println("Кол-во чисел: ")
    val n = readLine()!!.toInt()
    val indices = mutableListOf<Int>()
    
    for (i in 0 until n) {
        println("$i число: ")
        val num = readLine()!!.toInt()
        val (sum, product) = sumAndProductOfDigits(num)
        if (sum < product) {
            indices.add(i)
        }
    }
    println(indices.joinToString(" "))
}