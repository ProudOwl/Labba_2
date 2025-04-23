const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function printPattern(N) {
    const ch = String.fromCharCode('A'.charCodeAt(0) + N - 1);
    for (let i = N; i >= 1; --i) {
        let line = '';
        for (let j = 0; j < N - i + 1; ++j) {
            line += String.fromCharCode(ch.charCodeAt(0) - j) + ' ';
        }
        console.log(line);
    }
}

console.log("Введите значение N (положительное число): ");

rl.on('line', (input) => {
    const N = parseInt(input);
    if (N > 0) {
        printPattern(N);
        rl.close();
    } else {
        console.log("Введите корректное положительное значение: ");
    }
});