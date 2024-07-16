#include <bits/stdc++.h>
using namespace std;
int N;
int main() {
    cin >> N;
    string answer = "";
    for(int i = 0; i < N/4; i++) {
        answer += "long ";
    }
    cout << answer + "int" << '\n';
    return 0;
}