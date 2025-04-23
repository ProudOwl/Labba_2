<?php
function sumAndProductOfDigits($n) {
    $sum = 0;
    $product = 1;
    while ($n > 0) {
        $digit = $n % 10;
        $sum += $digit;
        $product *= $digit;
        $n = intval($n / 10);
    }
    return [$sum, $product];
}

echo "Кол-во чисел: ";
$n = intval(fgets(STDIN));
$indices = ""; // Строка для хранения индексов

for ($i = 0; $i < $n; $i++) {
    echo "$i число: ";
    $num = intval(fgets(STDIN));
    list($sum, $product) = sumAndProductOfDigits($num);
    if ($sum < $product) {
        $indices .= $i . " "; // Добавляем индекс в строку
    }
}
echo trim($indices) . "\n"; // Выводим индексы в конце
?>