function sumAndProductOfDigits(n: number): [number, number] {
    let sum = 0;
    let product = 1;
    while (n > 0) {
        const digit = n % 10;
        sum += digit;
        product *= digit;
        n = Math.floor(n / 10);
    }
    return [sum, product];
}

const n: number = Number(prompt("Кол-во чисел:"));
let indices = "";

for (let i = 0; i < n; i++) {
    const num: number = Number(prompt(`${i} число:`));
    const [sum, product] = sumAndProductOfDigits(num);
    if (sum < product) {
        indices += `${i} `;
    }
}

console.log(indices.trim());
