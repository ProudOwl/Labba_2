import java.util.Scanner;

public class Main {
    public static int counter(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = (num == 0) ? 1 : 0;
            int n = Math.abs(num);
            while (n != 0) {
                n /= 10;
                digits++;
            }
            if (digits % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Введите числа через запятую: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strNums = input.split(",");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i].trim());
        }
        System.out.println(counter(nums));
    }
}