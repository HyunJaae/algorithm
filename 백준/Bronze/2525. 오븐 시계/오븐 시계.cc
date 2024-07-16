#include <bits/stdc++.h>
using namespace std;
int a, b, c;
int h, m;
int main() {
    cin >> a >> b >> c;
    int d = b + c;
    h = (d >= 60)? a + d / 60 : a;
    if(h > 23) h -= 24;
    m = (d >= 60)? d % 60 : d;

    cout << h << " " << m << '\n';
    return 0;
}