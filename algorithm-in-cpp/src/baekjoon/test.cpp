#include <iostream>
#include <utility>
#include <vector>
#include <algorithm>

using namespace std;

// 난쟁이 9명 중 7명의 키의 합이 100
// 9명의 키 합 - 비난쟁이 2명의 합 = 100
int n = 9, r = 7, sum = 0, a[9];
vector<int> v;
pair<int, int> p;
void solve() {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < i; j++) {
            if(sum - a[i] - a[j] == 100) {
                p = {i, j};
                return;
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    for(int i = 0; i < n; i++) {
        cin >> a[i];
        sum += a[i];
    }
    solve();
    for (int i = 0; i < n; i++) {
        if(p.first == i || p.second == i) continue;
        v.push_back(a[i]);
    }
    sort(v.begin(), v.end());
    for (int i : v) cout << i << ' ';
    cout << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|