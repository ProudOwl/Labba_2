def counter(nums)
    count = 0
    nums.each do |num|
        digits = (num == 0) ? 1 : 0
        n = num.abs
        while n != 0
            n /= 10
            digits += 1
        end
        count += 1 if digits.odd?
    end
    count
end

print "Введите числа через запятую: "
input = gets.chomp
nums = input.split(',').map(&:to_i)
puts counter(nums)