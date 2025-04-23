def sum_and_product_of_digits(n):
    sum_digits = 0
    product_digits = 1
    while n > 0:
        digit = n % 10
        sum_digits += digit
        product_digits *= digit
        n //= 10
    return sum_digits, product_digits

n = int(input("Кол-во чисел: "))
indices = ""

for i in range(n):
    num = int(input(f"{i} число: "))
    sum_digits, product_digits = sum_and_product_of_digits(num)
    if sum_digits < product_digits:
        indices += f"{i} "

print(indices)