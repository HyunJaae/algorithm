#include <iostream>
#include <string>
using namespace std;

int N;
<<<<<<< HEAD
string pattern, fileName, first, last;
=======
string pattern, pre, las, fileName;
>>>>>>> ce52590 (B9996: 재풀이)
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    cin >> N >> pattern;
    int pos = pattern.find('*');
<<<<<<< HEAD
    first = pattern.substr(0, pos);
    last = pattern.substr(pos + 1);
    for (int i = 0; i < N; i++) {
        cin >> fileName;
        if (fileName.size() < first.size() + last.size()) cout << "NE\n";
        else {
            if (fileName.substr(0, pos) == first && fileName.substr(fileName.size() - last.size()) == last) cout << "DA\n";
=======
    pre = pattern.substr(0, pos);
    las = pattern.substr(pos + 1);
    for (int i = 0; i < N; i++) {
        cin >> fileName;
        if (pre.size() + las.size() > fileName.size()) cout << "NE\n";
        else {
            if (fileName.substr(0, pos) == pre && fileName.substr(fileName.size() - las.size()) == las) cout << "DA\n";
>>>>>>> ce52590 (B9996: 재풀이)
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