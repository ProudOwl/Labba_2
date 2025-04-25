import java.util.Scanner;

public class Main {
    static void printPattern(int N) {
        char ch = (char) ('A' + N - 1);
        for (int i = N; i >= 1; --i) {
            for (int j = 0; j < N - i + 1; ++j) {
                System.out.print((char) (ch - j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        System.out.print("Введите значение N (положительное число): ");
        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0 && N <= 26) break;
            } else {
                scanner.next(); // Сбрасываем неверный ввод
            }
            System.out.print("Введите корректное положительное значение: ");
        }
        printPattern(N);
        scanner.close();
    }
}
