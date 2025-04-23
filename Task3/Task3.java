import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кол-во чисел: ");
        int n = scanner.nextInt();
        StringBuilder indices = new StringBuilder();

        for (int i = 0; i < n; i++) {
            System.out.print(i + " число: ");
            int num = scanner.nextInt();
            int[] result = sumAndProductOfDigits(num);
            if (result[0] < result[1]) {
                indices.append(i).append(" ");
            }
        }
        System.out.println(indices.toString().trim());
    }

    public static int[] sumAndProductOfDigits(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return new int[]{sum, product};
    }
}