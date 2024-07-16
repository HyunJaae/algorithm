#include <iostream>
#include <string>
#include <map>
using namespace std;

int N, M;
string s, pNames[100004];
map<string, int> m;
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    cin >> N >> M;
    for (int i = 0; i < N; i++) {
        cin >> s;
        pNames[i + 1] = s;
        m[s] = i + 1;
    }

    for (int i = 0; i < M; i++) {
        cin >> s;
        if (atoi(s.c_str()) == 0) cout << m[s] << '\n';
        else cout << pNames[atoi(s.c_str())] << '\n';
    }
    return 0;
}