#include<bits/stdc++.h>
using namespace std;

vector<int> a;
int b[5];
vector<pair<int, int>> v;
vector<pair<int, int>> v2;
bool cmp(pair<int, int> a, pair<int, int> b) {
    cout << "cmp func" << '\n';
    cout << a.first << " : " << b.first << '\n';
    return a.first > b.first;
}

int main() {
    for(int i = 5; i >= 1; i--) b[i - 1] = i;
    for(int i = 5; i >= 1; i--) a.push_back(i);
    // 오름차순
    sort(b, b + 5);
    sort(a.begin(), a.end());
    for(int i : b) cout << i << ' ';
    cout << '\n';
    for(int i : a) cout << i << ' ';
    cout << '\n';
    
    sort(b, b + 5, less<int>());
    sort(a.begin(), a.end(), less<int>());
    for(int i : b) cout << i << ' ';
    cout << '\n';
    for(int i : a) cout << i << ' ';
    cout << '\n';

    // 내림차순
    sort(b, b + 5, greater<int>());
    sort(a.begin(), a.end(), greater<int>());
    for(int i : b) cout << i << ' ';
    cout << '\n';
    for(int i : a) cout << i << ' ';
    cout << '\n';

    // pair vector 오름차순
    cout << "pair vector 오름차순" << '\n';
    for(int i = 10; i >= 1; i--) {
        v.push_back({i, 10 - i});
    }
    sort(v.begin(), v.end());
    for(auto it : v) cout << it.first << " : " << it.second << '\n';
    // first는 내림차순, second는 오름차순 정렬
    cout << "first는 내림차순, second는 오름차순 정렬" << '\n';
    for(int i = 0; i >= 1; i--) {
        v.push_back({i, 10 - i});
    }
    sort(v.begin(), v.end(), cmp);
    for(auto it : v) cout << it.first << " : " << it.second << '\n';

    return 0;
}