#include <iostream>

using namespace std;

int arr[101];
int n = 0;
int m = 0;
int i, j, temp;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n >> m;

    for(int o = 0; o < n; o++) {
        arr[o] = o + 1;
    }

    for(int o = 0; o < m; o++) {
        cin >> i >> j;
        swap(arr[i - 1], arr[j - 1]);
    }

    for(int o = 0; o < n; o++) {
        cout << arr[o] << ' ';
    }
    cout << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|