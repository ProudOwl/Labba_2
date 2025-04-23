const readline = require('readline');

function counter(nums) {
    let count = 0;
    for (let num of nums) {
        let digits = (num === 0) ? 1 : 0;
        let n = Math.abs(num);
        while (n !== 0) {
            n = Math.floor(n / 10);
            digits++;
        }
        if (digits % 2 !== 0) {
            count++;
        }
    }
    return count;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Введите числа через запятую: ", (input) => {
    const nums = input.split(",").map(num => parseInt(num.trim()));
    console.log(counter(nums));
    rl.close();
});