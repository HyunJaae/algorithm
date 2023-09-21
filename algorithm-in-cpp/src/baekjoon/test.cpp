#include <iostream>
#include <map>
using namespace std;

map<char, int> m;
int N;
string firstName;
int main() {
    cin >> N;
    for(int i = 0; i < N; i++) {
        cin >> firstName;
        char ff = firstName.front();
        if (m.find(ff) != m.end()) {
            m[ff]++;
            continue;
        }
        m[ff] = 1;
    }
    bool check = true;
    for (auto v : m) {
        if (v.second >= 5) {
            cout << v.first;
            check = false;
        }
    }
    if (check) cout << "PREDAJA";
    cout << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|