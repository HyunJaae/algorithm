#include<bits/stdc++.h>
using namespace std;
int x, y;
int main() {
    cin >> x >> y;
    if(x > 0) {
        cout << ((y > 0)? 1 : 4) << '\n';
    } else {
        cout << ((y > 0)? 2 : 3) << '\n';
    }
    return 0;
}