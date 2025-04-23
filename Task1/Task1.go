package main

import (
    "fmt"
)

func printPattern(N int) {
    ch := 'A' + rune(N-1)
    for i := N; i >= 1; i-- {
        for j := 0; j < N-i+1; j++ {
            fmt.Printf("%c ", ch-rune(j))
        }
        fmt.Println()
    }
}

func main() {
    var N int
    fmt.Print("Введите значение N (положительное число): ")
    for {
        _, err := fmt.Scan(&N)
        if err == nil && N > 0 {
            break
        }
        fmt.Println("Введите корректное положительное значение: ")
    }
    printPattern(N)
}