use std::io;

fn counter(nums: Vec<i32>) -> i32 {
    let mut count = 0;
    for &num in &nums {
        let mut digits = if num == 0 { 1 } else { 0 };
        let mut n = num.abs();
        while n != 0 {
            n /= 10;
            digits += 1;
        }
        if digits % 2 != 0 {
            count += 1;
        }
    }
    count
}

fn main() {
    println!("Введите числа через запятую: ");
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let nums: Vec<i32> = input.trim().split(',')
        .map(|s| s.trim().parse().unwrap())
        .collect();
    println!("{}", counter(nums));
}