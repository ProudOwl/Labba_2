package main

import (
    "fmt"
    "strconv"
    "strings"
)

func counter(nums []int) int {
    count := 0
    for _, num := range nums {
        digits := 0
        if num == 0 {
            digits = 1
        }
        n := abs(num)
        for n != 0 {
            n /= 10
            digits++
        }
        if digits%2 != 0 {
            count++
        }
    }
    return count
}

func abs(x int) int {
    if x < 0 {
        return -x
    }
    return x
}

func main() {
    fmt.Println("Введите числа через запятую: ")
    var input string
    fmt.Scanln(&input)
    strNums := strings.Split(input, ",")
    nums := make([]int, len(strNums))
    for i, strNum := range strNums {
        nums[i], _ = strconv.Atoi(strings.TrimSpace(strNum))
    }
    fmt.Println(counter(nums))
}