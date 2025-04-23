func sumAndProductOfDigits(_ n: Int) -> (Int, Int) {
    var sum = 0
    var product = 1
    var num = n
    while num > 0 {
        let digit = num % 10
        sum += digit
        product *= digit
        num /= 10
    }
    return (sum, product)
}

print("Кол-во чисел: ", terminator: "")
let n = Int(readLine()!)!
var indices = ""

for i in 0..<n {
    print("\(i) число: ", terminator: "")
    let num = Int(readLine()!)!
    let (sum, product) = sumAndProductOfDigits(num)
    if sum < product {
        indices += "\(i) "
    }
}

print(indices)