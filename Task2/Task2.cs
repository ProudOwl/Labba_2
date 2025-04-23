using System;
using System.Linq;

class Program
{
    static int counter(int[] nums)
    {
        int count = 0;
        foreach (var number in nums)
        {
            int digits = (number == 0) ? 1 : 0;
            int num = Math.Abs(number);

            while (num != 0)
            {
                num /= 10;
                digits++;
            }
            if (digits % 2 != 0)
            {
                count++;
            }
        }
        return count;
    }

    static void Main()
    {
        Console.WriteLine("Введите числа через запятую: ");
        var input = Console.ReadLine();
        var nums = input.Split(',').Select(int.Parse).ToArray();
        Console.WriteLine(counter(nums));
    }
}