#include <iostream>
#include <vector>

using namespace std;

void sumAndProductOfDigits(int n, int& sum, int& product) {
    sum = 0;
    product = 1;
    while (n > 0) {
        int digit = n % 10;
        sum += digit;
        product *= digit;
        n /= 10;
    }
}

int main() {
    int n;
    int num;
    cout << "Кол-во чисел: ";
    cin >> n;
    vector<int> numbers;
    for (int i = 0; i < n; i++) {
        cout << i << " число: ";
        cin >> num;
        numbers.push_back(num);
    }
    
    for (size_t i = 0; i < numbers.size(); ++i) {
        int sum, product;
        sumAndProductOfDigits(numbers[i], sum, product);
        if (sum < product) {
            cout << i << " ";
        }
    }
    cout << endl;
    return 0;
}