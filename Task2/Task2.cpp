#include <iostream>
#include <vector>
#include <sstream>
using namespace std;

int counter(const std::vector<int>& nums) {
    int count = 0;
    for (int num : nums) {
        int digits = (num == 0) ? 1 : 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        if (digits % 2 != 0) {
            count++;
        }
    }
    return count;
}

int main() {
    cout << "Введите числа через запятую: ";
    string input;
    getline(std::cin, input);
    vector<int> nums;
    string numStr;
    stringstream ss(input);
    
    while (getline(ss, numStr, ',')) {
        nums.push_back(stoi(numStr));
    }
    
    cout << counter(nums) << endl;
    return 0;
}