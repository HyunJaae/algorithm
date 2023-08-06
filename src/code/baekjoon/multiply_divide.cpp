#include<bits/stdc++.h>
using namespace std;
int a, b;
double c, d;
string e;
int main() {
    cin >> a >> b;
    cout << a * b << '\n';

    scanf("%lf %lf", &c, &d); // double 입력은 %lf, long double 입력은 %Lf
    /*
    기본적으로 lf 출력은 소수점 6자리까지 출력한다.
    그렇기 때문에 소수점 자리수를 늘려주어야 한다.
    오차범위가 10^-9 이하여야 하므로 여유있게 %.10lf 이상으로 해주자.
    */
    printf("%.13lf\n", c / d);

    // 실수 전체에 대한 자리수 표현으로 입력 값 123.456에 5를 매개변수로 주는 경우, 123.45 로 표현한다.
    cout.precision(13);
    // 정수 부분이 아닌 소수점에만 자리수를 적용하는 방식으로 고정 소수점 방식이다.
    cout << fixed;
    // fixed를 해제하고 싶다면 cout.unsetf() 에 ios::fixed 를 넘겨주면 된다.
    cout << c / d << '\n';

    cin >> e;
    cout << e + "?\?!" << '\n';

    return 0;
}