def SumAndProductOfDigits(n)
  sum = 0
  product = 1
  while n > 0
    digit = n % 10
    sum += digit
    product *= digit
    n /= 10
  end
  return sum, product
end

print "Кол-во чисел: "
n = gets.to_i
indices = ""

(0...n).each do |i|
  print "#{i} число: "
  num = gets.to_i
  sum, product = SumAndProductOfDigits(num)
  if sum < product
    indices += "#{i} "
  end
end

puts indices