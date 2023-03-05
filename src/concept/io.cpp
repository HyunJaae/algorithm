/* C++의 모든 표준 라이브러리가 포함된 헤더파일, include 해준다. */
#include <bits/stdc++.h>
/**
 * std 라는 네임스페이스 사용, 네임스페이스란 많은 라이브러리를 불러서 사용하다보면
 * 변수명 중복이 발생할 수 있는데 이를 방지하기 위해서 변수명에 범위를 걸어놓는 것을 의미한다.
 * cin 이나 cout 등을 사용할 때 원래는 std 라는 네임스페이스를 통해 std::cin 이렇게
 * 호출을 해야 하는데 std 를 기본으로 설정해서 std:: 없이 호출 가능
 */
using namespace std;
string a;
int main()
{
    cin >> a;
    cout << a << "\n";
    /**
     * 프로세스를 정상적으로 마무리한다는 의미 (process exit call success)
     * 또한 C++ 은 cpp 파일당 하나의 main 함수만을 만들 수 있다.
     * 하나의 main 함수를 기반으로 로직을 구성해야 한다.
     */
    return 0;
}