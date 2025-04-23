using System;
using System.Collections.Generic;

class Program {
    static (int sum, int product) SumAndProductOfDigits(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return (sum, product);
    }

    static void Main() {
        Console.Write("Кол-во чисел: ");
        int n = int.Parse(Console.ReadLine());
        List<int> indices = new List<int>();

        for (int i = 0; i < n; i++) {
            Console.Write($"{i} число: ");
            int num = int.Parse(Console.ReadLine());
            var (sum, product) = SumAndProductOfDigits(num);
            if (sum < product) {
                indices.Add(i);
            }
        }
        Console.WriteLine(string.Join(" ", indices));
    }
}