#include <iostream>
#include <string>
using namespace std;

string s;
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    getline(cin, s);
    
    for (int i = 0; i < s.size(); i++) {
        if (s[i] >= 65 && s[i] < 91) {
            if (s[i] + 13 > 90) s[i] = s[i] + 13 - 26;
            else s[i] = s[i] + 13;
        }
        if (s[i] >= 97 && s[i] < 123) {
            if (s[i] + 13 > 122) s[i] = s[i] + 13 - 26;
            else s[i] = s[i] + 13;
        }
    }
    cout << s << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|