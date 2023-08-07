#include <bits/stdc++.h>
using namespace std;
int h, m;
int main() {
    cin >> h >> m;

    // if(h == 0) {
    //     h = (m < 45)? 23 : h;
    //     m = (m < 45)? m + 15 : m - 45;
    // } else {
    //     h = (m < 45)? h - 1 : h;
    //     m = (m < 45)? m + 15 : m - 45;
    // }

    if(m < 45) {
        h = (h == 0)? 23 : h - 1;
        m = m + 15;
    } else {
        m = m - 45;
    }
    cout << h << " " << m << '\n';
    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|