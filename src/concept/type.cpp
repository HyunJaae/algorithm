#include <bits/stdc++.h>
using namespace std;
int ret = 1;
/* void : 리턴하는 값이 없다. */
void a()
{
    ret = 2;
    cout << ret << "\n";
    return;
}
/* 함수를 선언할 때는 항상 호출되는 위쪽 부분에 선언해야 한다. */
double b()
{
    return 1.2333;
}
/**
 * 타입과 인자만 선언을 해 놓고 아래 쪽에 함수를 정의하는 방법도 있다.
 * 선언부와 정의부를 나누어서 설정하는 방법이다.
 * 그러나 알고리즘은 시간 싸움이기 때문에 선언과 정의를 한번에 하는 방법으로 한다.
 */
double c();

int main()
{
    a();
    double ret = b();
    cout << ret << "\n";
    double ret = c();
    cout << ret << "\n";
    return 0;
}

double c()
{
    return 1.3444;
}