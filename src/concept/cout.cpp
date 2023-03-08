#include <bits/stdc++.h>
using namespace std;
string a = "개발자 화이팅!";
string b = "코딩 테스트 완전 정복";
double c = 1.23456789;
int main()
{
    cout << a << '\n';
    cout << a << " "
         << "" << b << '\n';

    cout << c << '\n';
    /* 소수점 6자리까지 반올림 */
    cout.precision(7);
    cout << c << '\n';
    return 0;
}