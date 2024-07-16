#include <bits/stdc++.h>
using namespace std;
int n;
int main() {
    ios_base::sync_with_stdio(false);

    cin >> n;

    for(int i = 0; i < 9; i++) {
        cout << n << " * " << i + 1 << " = " << (i + 1) * n << '\n';
    }

    return 0;
}