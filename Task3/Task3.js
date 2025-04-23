const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function sumAndProductOfDigits(n) {
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

rl.question("Кол-во чисел: ", (count) => {
    count = parseInt(count);
    let indices = "";

    const askForNumbers = (i) => {
        if (i < count) {
            rl.question(`${i} число: `, (num) => {
                num = parseInt(num);
                const [sum, product] = sumAndProductOfDigits(num);
                if (sum < product) {
                    indices += `${i} `;
                }
                askForNumbers(i + 1);
            });
        } else {
            console.log(indices.trim());
            rl.close();
        }
    };
    askForNumbers(0);
});