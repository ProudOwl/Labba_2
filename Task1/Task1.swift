import Foundation

func printPattern(N: Int) {
    let ch = Character(UnicodeScalar(Int("A".unicodeScalars.first!.value) + N - 1)!)
    for i in stride(from: N, through: 1, by: -1) {
        for j in 0..<(N - i + 1) {
            print(Character(UnicodeScalar(ch.unicodeScalars.first!.value - UInt32(j))!), terminator: " ")
        }
        print()
    }
}

print("Введите значение N (положительное число): ", terminator: "")
var N: Int = 0

while true {
    if let input = readLine(), let value = Int(input), value > 0, value <= 26{
        N = value
        break
    }
    print("Введите корректное положительное значение: ", terminator: "")
}
printPattern(N: N)
