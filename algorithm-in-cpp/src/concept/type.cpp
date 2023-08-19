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
/* double 타입 반환 */
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

/* char, 문자 */
char d()
{
    char a = 'a';
    return a;
}

/* string, 문자열 */
int str()
{
    string a = "나는야";
    /**
     * 문자열을 [0] 로 접근한다는 의미는 1바이트씩 출력한다는 것을
     * 의미한다. 한글의 경우 한 글자당 3바이트이기 때문에 a[0]은 이상한 문자를 출력한다.
     * 따라서 a[0] ~ a[2] 는 문자열 "나는야" 에서 "나" 부분만을 출력한다.
     */
    cout << a[0] << "\n";
    cout << a[0] << a[1] << a[2] << '\n';
    cout << a << "\n";
    string b = "abc";
    cout << b[0] << "\n";
    cout << b << "\n";
    return 0;
}

int main()
{
    a();
    double ret = b();
    cout << ret << "\n";
    ret = c();
    cout << ret << "\n";
    char a = d();
    cout << a << "\n";
    str();
    return 0;
}

double c()
{
    return 1.3444;
}
