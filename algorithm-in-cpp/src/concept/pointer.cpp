#include<bits/stdc++.h>
using namespace std;
int i;
string s = "devlee";
int main() {
    i = 0;
    int * a = &i;
    cout << a << '\n';
    string * b = &s;
    cout << b << '\n';

    return 0;
}
/**
 * 포인터의 크기는 타입에 상관없이 OS가 32bit라면 4바이트, 64bit라면 8바이트로 고정되어있다.
 * 이는 집 주소의 크기(포인터의 크기)가 집의 크기(메모리의 크기)와 관련이 없다는 것을 생각하면 된다.
*/