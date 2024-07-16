#include <bits/stdc++.h>
using namespace std;
int X, N, a, b;
int main() {
    cin >> X >> N;

    int total = 0;
    for(int i = 0; i < N; i++) {
        cin >> a >> b;
        total += a * b;
    }

    if(total == X) {
        cout << "Yes" << '\n';
    } else {
        cout << "No" << '\n';
    }

    return 0;
}