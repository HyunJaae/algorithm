#include <iostream>
using namespace std;
int N, v;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin >> N;
    int arr[N];
    for(int i = 0; i < N; i++) {
        int a;
        cin >> a;
        arr[i] = a;
    }
    int n = 0;
    cin >> v;
    for(int i = 0; i < N; i++) {
        if(arr[i] == v) n++;
    }
    cout << n << '\n';
    return 0;
}