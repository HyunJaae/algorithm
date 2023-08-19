#include <iostream>
using namespace std;
int N, X;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin >> N >> X;
    int arr[N];
    for(int i = 0; i < N; i++) {
        int arrVal;
        cin >> arrVal;
        arr[i] = arrVal;
    }
    for(int i = 0; i < N; i++) {
        if(arr[i] < X) cout << arr[i] << '\n';
    }

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|