#include<bits/stdc++.h>
using namespace std;
int a, b;
double c, d;
int main() {
    cin >> a >> b;
    cout << a * b << '\n';

    scanf("%lf %lf", &c, &d);
    printf("%.13lf\n", c / d);

    cout.precision(13);
    cout << fixed;
    cout << c / d << '\n';

    return 0;
}