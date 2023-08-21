#include <iostream>
#include <algorithm>

using namespace std;
int N;
int mini = 1000001;
int maxi = -1000001;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin >> N;
    int inputVal;
    for(int i = 0; i < N; i++) {
        cin >> inputVal;
        mini = min(mini, inputVal);
        maxi = max(maxi, inputVal);
    }

    cout << mini << ' ' << maxi << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|