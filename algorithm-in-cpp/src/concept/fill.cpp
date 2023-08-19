#include<bits/stdc++.h>
using namespace std;

int a[10];
int b[10][10];
int main() {
    // 시작 값은 포함하고 끝 값은 포함하지 않는다.
    fill(&a[0], &a[10], 100);
    for(int i = 0; i < 10; i++) {
        cout << a[i] << " ";
    }
    cout << '\n';
    cout << '\n';

    fill(a, a + 10, 15);
    for(int i = 0; i < 10; i++) {
        cout << a[i] << " ";
    }
    cout << '\n';
    cout << '\n';

    fill(&b[0][0], &b[9][10], 2);
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
            cout << b[i][j] << " ";
        }
        cout << '\n';
    }
    cout << '\n';

    fill(&b[0][0], &b[0][0] + 10 * 10, 4);
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
            cout << b[i][j] << " ";
        }
        cout << '\n';
    }
    return 0;
}