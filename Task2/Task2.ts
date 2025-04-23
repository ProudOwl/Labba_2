function counter(nums: number[]): number {
    let count = 0;
    for (const num of nums) {
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

const input = prompt("Введите числа через запятую: ") || "";
const nums = input.split(",").map(num => parseInt(num.trim()));
console.log(counter(nums));
