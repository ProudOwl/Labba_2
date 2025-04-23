using System;

class Program {
    static void PrintPattern(int N) {
        char ch = (char)('A' + N - 1);
        for (int i = N; i >= 1; --i) {
            for (int j = 0; j < N - i + 1; ++j) {
                Console.Write($"{(char)(ch - j)} ");
            }
            Console.WriteLine();
        }
    }

    static void Main() {
        int N;
        Console.WriteLine("Введите значение N (положительное число): ");
        while (!int.TryParse(Console.ReadLine(), out N) || N <= 0) {
            Console.WriteLine("Введите корректное положительное значение: ");
        }
        PrintPattern(N);
    }
}
