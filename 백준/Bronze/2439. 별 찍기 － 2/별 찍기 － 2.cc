#include <iostream>
using namespace std;
int N;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    cin >> N;

    for(int i = 0; i < N; i++) {
        for(int s = i + 1; s < N; s++) {
            cout << " ";
        }
        for(int j = 0; j < i + 1; j++) {
            cout << "*";
        }
        cout << '\n';
    }
    return 0;
}