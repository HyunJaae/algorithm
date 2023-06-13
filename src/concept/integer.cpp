#include <bits/stdc++.h>

using namespace std;

int main()
{
    /**
     * ios_base::sync_with_stdio 구문은 c의 stdio와 cpp의 iostream을 동기화시켜주는 역할을 하는데,
     * 이 때 iostream과 stdio의 버퍼를 모두 사용하기 때문에 딜레이가 발생합니다.
     * 따라서, ios_base::sync_with_stdio(false); 코드를 작성해줌으로써 동기화를 비활성화시켜줍니다.
     * 이로 인해, c++만의 독립적인 버퍼가 생성되어 c의 버퍼와 병행하여 사용할 수 없게 되지만,
     * 사용하는 버퍼의 수가 줄어들었기 때문에 실행 속도는 빨라지게 됩니다.
     * 알고리즘 문제를 풀 때는 대부분 싱글 쓰레드 환경이기 때문에 해당 코드를 추가해줘도 문제가 발생하지 않을 확률이 높습니다.
     */
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int a = 3;
    int b = 2;
    cout << a / b << '\n'; // 1
    double c = 3;
    double d = 2;
    cout << c / d << '\n'; // 1.5
}