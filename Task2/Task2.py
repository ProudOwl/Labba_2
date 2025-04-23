def counter(nums):
    count = 0
    for num in nums:
        digits = 1 if num == 0 else 0
        n = abs(num)
        while n != 0:
            n //= 10
            digits += 1
        if digits % 2 != 0:
            count += 1
    return count

input_str = input("Введите числа через запятую: ")
nums = list(map(int, input_str.split(',')))
print(counter(nums))