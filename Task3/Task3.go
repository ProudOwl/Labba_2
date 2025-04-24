package main

import (
	"fmt"
)

func sumAndProductOfDigits(n int) (int, int) {
	sum := 0
	product := 1
	for n > 0 {
		digit := n % 10
		sum += digit
		product *= digit
		n /= 10
	}
	return sum, product
}

func main() {
	var n int
	fmt.Print("Кол-во чисел: ")
	fmt.Scan(&n)

	var indices string

	for i := 0; i < n; i++ {
		var num int
		fmt.Printf("%d число: ", i)
		fmt.Scan(&num)
		sum, product := sumAndProductOfDigits(num)
		if sum < product {
			indices += fmt.Sprintf("%d ", i)
		}
	}

	if indices != "" {
		fmt.Println(indices)
	}
}
