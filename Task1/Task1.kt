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
    print("ÐÐ²ÐµÐ´Ð¸ÑÐµ Ð·Ð½Ð°ÑÐµÐ½Ð¸Ðµ N (Ð¿Ð¾Ð»Ð¾Ð¶Ð¸ÑÐµÐ»ÑÐ½Ð¾Ðµ ÑÐ¸ÑÐ»Ð¾): ")
    val N = readLine()?.toIntOrNull()
    if (N != null && N > 0) {
       printPattern(N)
    } else {
        println("ÐÐ²ÐµÐ´Ð¸ÑÐµ ÐºÐ¾ÑÑÐµÐºÑÐ½Ð¾Ðµ Ð¿Ð¾Ð»Ð¾Ð¶Ð¸ÑÐµÐ»ÑÐ½Ð¾Ðµ Ð·Ð½Ð°ÑÐµÐ½Ð¸Ðµ")
    }
}