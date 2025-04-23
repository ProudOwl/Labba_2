use std::io;

fn print_pattern(n: usize) {
    let ch = ('A' as u8 + n as u8 - 1) as char;
    for i in (1..=n).rev() {
        for j in 0..(n - i + 1) {
            print!("{} ", (ch as u8 - j as u8) as char);
        }
        println!();
    }
}

fn main() {
    let mut input = String::new();
    println!("Введите значение N (положительное число): ");
    loop {
        io::stdin().read_line(&mut input).expect("Ошибка чтения");
        let n: usize = match input.trim().parse() {
            Ok(num) if num > 0 => num,
            _ => {
                println!("Введите корректное положительное значение: ");
                input.clear();
                continue;
            }
        };
        print_pattern(n);
        break;
    }
}