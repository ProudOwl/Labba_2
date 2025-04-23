def print_pattern(n)
  ch = 'A'.ord + n - 1
  (n).downto(1) do |i|
    (0..(n - i)).each do |j|
      print "#{(ch - j).chr} "
    end
    puts
  end
end

n = 0
print "Введите значение N (положительное число): "
while true
  input = gets.chomp
  if input =~ /^\d+$/ && (n = input.to_i) > 0
    break
  end
  print "Введите корректное положительное значение: "
end
print_pattern(n)