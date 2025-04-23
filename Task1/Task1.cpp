#include <iostream>
using namespace std;

void printPattern(int N) {
    char ch = 'A' + N - 1;
    for (int i = N; i >= 1; --i) {
        for (int j = 0; j < N - i + 1; ++j) {
            cout << char(ch - j) << " ";
        }
        cout << endl;
    }
}

int main() {
    int N;
    cout << "Введите значение N (положительное число): ";
    while (!(cin >> N) || N <= 0) {
        cout << "Введите корректное положительное значение: ";
    }
    printPattern(N);
    return 0;
}