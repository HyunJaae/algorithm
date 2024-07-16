#include <iostream>
using namespace std;

string str;
int cnt[26];
int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    cin >> str;
    for (char c : str) cnt[c - 'a']++;
    for (int i : cnt) cout << i << ' ';
    cout << '\n';
    return 0;
}