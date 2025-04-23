use std::io;

fn SumAndProductOfDigits(n: i32) -> (i32, i32) {
    let mut sum = 0;
    let mut product = 1;
    let mut num = n;

    while num > 0 {
        let digit = num % 10;
        sum += digit;
        product *= digit;
        num /= 10;
    }
    (sum, product)
}

fn main() {
    let mut input = String::new();
    println!("Кол-во чисел: ");
    io::stdin().read_line(&mut input).unwrap();
    let n: i32 = input.trim().parse().unwrap();
    let mut indices = Vec::new();

    for i in 0..n {
        input.clear();
        println!("{} число: ", i);
        io::stdin().read_line(&mut input).unwrap();
        let num: i32 = input.trim().parse().unwrap();
        let (sum, product) = SumAndProductOfDigits(num);
        if sum < product {
            indices.push(i);
        }
    }
    println!("{:?}", indices);
}