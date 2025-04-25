<?php
function printPattern($N) {
    $ch = chr(ord('A') + $N - 1);
    for ($i = $N; $i >= 1; --$i) {
        for ($j = 0; $j < $N - $i + 1; ++$j) {
            echo chr(ord($ch) - $j) . " ";
        }
        echo "\n";
    }
}

echo "Введите значение N (положительное число): ";
while (true) {
    $input = trim(fgets(STDIN));
    if (is_numeric($input) && $input > 0 && $input <= 26) {
        $N = (int)$input;
        break;
    }
    echo "Введите корректное положительное значение: ";
}
printPattern($N);
?>
