#include<bits/stdc++.h>
using namespace std;

const int max_n = 1024;
int a[max_n];
int a2[max_n][max_n];
int main() {
    memset(a, -1, sizeof(a));
    memset(a2, 0, sizeof(a2));
    for(int i = 0; i < 10; i++) cout << a[i] << " ";
    cout << '\n';
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
            cout << a2[i][j] << " ";
        }
        cout << '\n';
    }
    return 0;
}