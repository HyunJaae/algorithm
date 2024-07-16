#include <iostream>

using namespace std;
int n = 0;
int m = 0;
int i, j, k;
string result;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n >> m;
    int arr[n];
    for(int q = 0; q < n; q++) {
        arr[q] = 0;
    }

    for(int o = 0; o < m; o++) {
        cin >> i >> j >> k;
        for(int q = i - 1; q < j; q++) {
            arr[q] = k;
        }
    }

    for(int value : arr) {
        cout << value << ' ';
    }
    cout << '\n';
    
    return 0;
}