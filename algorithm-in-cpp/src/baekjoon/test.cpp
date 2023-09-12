#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void print(vector<int> b) {
    sort(b.begin(), b.end());
    for(int i : b) cout << i << ' ';
    cout << '\n';
}

int arr[9];
vector<int> result;
int n = 9, r = 7;
void combi(int start, vector<int> b) {
    if(b.size() == r) {
        int sum = 0;
        for (int i : b) sum += i;
        sort(b.begin(), b.end());
        if (sum == 100) {
            for (int i : b) cout << i << '\n';
            exit(0);
        }
        result = b;
        return;
    }

    for (int i = start + 1; i < n; i++) {
        b.push_back(arr[i]);
        combi(i, b);
        b.pop_back();
    }
    return;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    
    vector<int> b;
    combi(-1, b);
    for (int i : result) cout << i << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|