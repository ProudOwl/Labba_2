fun printPattern(N: Int) {
    val ch = 'A' + (N - 1)
    for (i in N downTo 1) {
        for (j in 0 until (N - i + 1)) {
            print("${ch - j} ")
        }
        println()
    }
}

fun main() {
    print("Введите число N (положительное число): ")
    val N = readLine()?.toIntOrNull()
    if (N != null && N > 0) {
       printPattern(N)
    } else {
        println("Неверный ввод")
    }
}
