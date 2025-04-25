def print_pattern(N):
    ch = chr(ord('A') + N - 1)
    for i in range(N, 0, -1):
        for j in range(N - i + 1):
            print(chr(ord(ch) - j), end=' ')
        print()

N = 0
while True:
    try:
        N = int(input("Введите значение N (положительное число): "))
        if N > 0 and N <= 26:
            break
    except ValueError:
        pass
print_pattern(N)
