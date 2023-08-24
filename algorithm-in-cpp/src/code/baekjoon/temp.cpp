#include <iostream>
#include <cstring>

using namespace std;

int arr[101];
int n = 0;
int m = 0;
int i, j, k;
string result;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    memset(arr, 0, sizeof(arr));
    cin >> n >> m;
    

    for(int o = 0; o < m; o++) {
        cin >> i >> j >> k;
        for(int q = i - 1; q < j; q++) {
            arr[q] = k;
        }
    }

    for(int q = 0; q < n; q++) {
        cout << arr[q] << ' ';
    }
    cout << '\n';
    
    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|