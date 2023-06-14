#include<bits/stdc++.h>
using namespace std;
int main() {
    string a = "abcda";
    string * b = &a;
    cout << b << '\n';
    cout << *b << '\n';

    return 0;
}
/**
 * c++에서 *(asterisk operator) 기호는 3가지 용도로 사용된다.
 * 1. 이항 연산자로 곱셈 연산
 * 2. 포인터 타입의 선언
 * 3. 역참조(dereference)로 메모리를 기반으로 변수의 값에 접근
 * 위 main 함수는 3번의 예시이다.
*/