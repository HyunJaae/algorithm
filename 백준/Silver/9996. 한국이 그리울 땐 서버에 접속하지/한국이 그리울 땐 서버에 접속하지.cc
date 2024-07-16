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
    for (int i = 0; i < N; i++) {
        cin >> fileName;
        if (pre.size() + las.size() > fileName.size()) cout << "NE\n";
        else {
            if (fileName.substr(0, pos) == pre && fileName.substr(fileName.size() - las.size()) == las) cout << "DA\n";
            else cout << "NE\n";
        }
    }
    return 0;
}
