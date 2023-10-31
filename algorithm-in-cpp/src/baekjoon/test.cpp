#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

string s, temp;
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    cin >> s;
    temp = s;
    reverse(temp.begin(), temp.end());
    cout << (temp == s) << '\n';
    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|