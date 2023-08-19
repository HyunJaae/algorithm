#include <bits/stdc++.h>
using namespace std;
int a = 1, b = 2;
double c = 1.23456789;
string d = "어셈블";
/* printf 는 형식을 지정해서 출력할 때 좋다. */
int main()
{
    printf("홍철 %d : 지수 %d\n", a, b);
    /* 소수점 6자리까지 반올림한다. */
    printf("%.6lf\n", c);
    printf("%02d\n", b);
    /**
     * printf 문자열을 출력하려면 string을 문자열에 대한
     * 포인터(char *) 타입으로 바꿔주어야 하기 때문에 c_str() 함수를 호출하여 출력한다.
     * (그래서 보통 문자열을 출력할 때는 간단히 cout을 사용한다.)
     */
    printf("어벤져스!!!! : %s\n", d.c_str());
    return 0;
}