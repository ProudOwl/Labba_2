<?php
function counter($nums) {
    $count = 0;
    foreach ($nums as $num) {
        $digits = ($num == 0) ? 1 : 0;
        $n = abs($num);
        while ($n != 0) {
            $n = intval($n / 10);
            $digits++;
        }
        if ($digits % 2 != 0) {
            $count++;
        }
    }
    return $count;
}

echo "Введите числа через запятую: ";
$input = trim(fgets(STDIN));
$nums = array_map('intval', explode(',', $input));
echo counter($nums) . PHP_EOL;
?>