#include<bits/stdc++.h>
using namespace std;

int main() {
    double ret = 2.12345;
    int n = 2;
    double ret2 = ret / double(n);
    cout << ret2 << '\n';
    int a = (int) round(ret / double(n));
    cout << a << '\n';
    int b = (int) ret * 100;
    cout << b << '\n';
    b = (int) 100 * ret;
    cout << b << '\n';
    return 0;
}