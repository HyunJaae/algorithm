#include <bits/stdc++.h>
using namespace std;
/**
 * 상수 또는 매크로를 정의할 수 있다.
 */
#define PI 3.14159
#define loop(x, n) for (int x = 0; x < n; x++)

int main()
{
    cout << PI << '\n';
    int sum = 0;
    loop(i, 10)
    {
        sum += i;
    }
    cout << sum << '\n';
    return 0;
}