#include <iostream>
#include <string>
using namespace std;

int N;
string pattern, fileName, first, last;
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    cin >> N >> pattern;
    int pos = pattern.find('*');
    first = pattern.substr(0, pos);
    last = pattern.substr(pos + 1);
    for (int i = 0; i < N; i++) {
        cin >> fileName;
        // if (fileName.size() < first.size() + last.size()) cout << "NE\n";
        if (fileName.size() < pos || fileName.size() < last.size()) {
            cout << "NE\n";
        } else {
            if (fileName.substr(0, pos) == first && fileName.substr(fileName.size() - last.size()) == last) cout << "DA\n";
            else cout << "NE\n";
        }
        
    }
    return 0;
}



// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|