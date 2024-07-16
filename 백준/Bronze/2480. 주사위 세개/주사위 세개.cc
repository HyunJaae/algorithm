#include <bits/stdc++.h>
using namespace std;
int a, b, c;
int reword;
int main() {
    ios_base::sync_with_stdio(false);

    cin >> a >> b >> c;

    if(a == b) {
        reword = (a == c)? 10000 + a * 1000 : 1000 + a * 100;
    } else {
        if(a == c) {
            reword = 1000 + a * 100;
        } else if(b == c) {
            reword = 1000 + b * 100;
        } else {
            int big = max({a, b, c});
            reword = big * 100;
        }
    }

    cout << reword << '\n';

    return 0;
}