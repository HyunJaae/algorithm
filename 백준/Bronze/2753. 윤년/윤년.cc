#include <bits/stdc++.h>
using namespace std;
int a;
int main() {
    cin >> a;
    cout << ((a % 4 == 0 && a % 100 != 0)? 1 : (a % 400 == 0)? 1 : 0) << '\n';
    return 0;
}