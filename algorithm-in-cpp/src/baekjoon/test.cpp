#include <iostream>
#include <string>
using namespace std;

int N;
string pattern, pre, las, fileName;
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    cin >> N >> pattern;
    int pos = pattern.find('*');
    pre = pattern.substr(0, pos);
    las = pattern.substr(pos + 1);
    cout << las.size() << ' ' << pos+1 << '\n';
    return 0;
}



// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|