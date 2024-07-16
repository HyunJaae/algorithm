#include <bits/stdc++.h>
using namespace std;
int h, m;
int main() {
    cin >> h >> m;

    if(m < 45) {
        h = (h == 0)? 23 : h - 1;
        m = m + 15;
    } else {
        m = m - 45;
    }
    cout << h << " " << m << '\n';

    return 0;
}