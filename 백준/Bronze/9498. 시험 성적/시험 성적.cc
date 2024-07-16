#include<bits/stdc++.h>
using namespace std;
int a;
int main() {
    cin >> a;
    if(90 <= a && a <= 100) cout << 'A' << '\n';
    if(80 <= a && a <= 89) cout << 'B' << '\n';
    if(70 <= a && a <= 79) cout << 'C' << '\n';
    if(60 <= a && a <= 69) cout << 'D' << '\n';
    if(a < 60) cout << 'F' << '\n';
    return 0;
}