#include <iostream>
using namespace std;
int A, B;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    while(true) {
        cin >> A >> B;
        if(A + B == 0) break;
        cout << A + B << '\n';
    }
    return 0;
}