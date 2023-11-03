#include <iostream>
#include <string>
using namespace std;

string s, temp;
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    getline(cin, s);
    for (char c : s) {
        if (c < 58 || c == ' ') {
            temp += c;
            continue;
        }
        if (c - 'a' < 0) {
            if ((c-'A') + 13 >= 26) {
                temp += c+13-26;
            } else temp += c+13;
        } else {
            if ((c - 'a') + 13 >= 26) {
                temp += c+13-26;
            } else temp += c+13;
        }
    }
    cout << temp << '\n';
    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|