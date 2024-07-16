#include <bits/stdc++.h>
using namespace std;
int a, b;
int main() {
    cin >> a >> b;
    if(a > b) cout << ">" << '\n';
    if(a < b) cout << "<" << '\n';
    if(a == b) cout << "==" << '\n';
    return 0;
}