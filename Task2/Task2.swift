import Foundation

func counter(_ nums: [Int]) -> Int {
    var count = 0
    for num in nums {
        var digits = (num == 0) ? 1 : 0
        var n = abs(num)
        while n != 0 {
            n /= 10
            digits += 1
        }
        if digits % 2 != 0 {
            count += 1
        }
    }
    return count
}

print("Введите числа через запятую: ")
if let input = readLine() {
    let nums = input.split(separator: ",").map { Int($0.trimmingCharacters(in: .whitespaces))! }
    print(counter(nums))
}