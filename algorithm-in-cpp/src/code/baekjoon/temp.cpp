#include <iostream>
#include <algorithm>

using namespace std;
int N;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin >> N;
    int arr[N];
    for(int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);
    cout << arr[0] << " " << arr[N-1] << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|