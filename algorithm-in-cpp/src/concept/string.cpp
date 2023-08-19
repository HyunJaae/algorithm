#include <bits/stdc++.h>
using namespace std;
int func_reverse()
{
    string a = "It's hard to have a sore leg";
    reverse(a.begin(), a.end());
    cout << a << '\n';
    reverse(a.begin(), a.end());
    cout << a << '\n';
    reverse(a.begin() + 3, a.end());
    cout << a << '\n';

    return 0;
}

typedef long long ll;
int ascii()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    string s = "123";
    cout << s[0] << '\n';
    /**
     * s[0] 인 "1"은 아스키코드에서 49이고 49에 1을 더한 값인 50은
     * 아스키코드에서 2이기 때문에 123 에서 223이 된다.
     * 즉, 문자열에서 + 하는 연산은 "아스키코드"를 기반으로 수행된다.
     * 문자열을 이루는 문자는 아스키(ASCII) 값(0에서 127 사이의 정수)로
     * 저장되어 구현된다.
     * 예를 들어 'A'의 ASCII 값은 65이다. 이는 문자 변수에 'A'를 할당하면
     * 'A' 자체가 아니라 65라는 숫자가 해당 변수에 저장된다는 것이다.
     */
    s[0]++;
    cout << s << "\n"; // 223
    /* 'a' 문자의 아스키 코드 출력 */
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    char a = 'a';
    cout << "ascii 'a' = " << (int)a << '\n';

    return 0;
}

int main()
{
    string a = "love is";
    /* push_back() 메서드도 있지만 문자 밖에 더하지 못해 보통 += 를 쓴다. */
    a += " pain!";
    /* 문자열 끝을 지운다. O(1)의 시간복잡도 */
    a.pop_back();
    /* size() 문자열의 사이즈를 반환, O(1)의 시간복잡도 */
    cout << a << " : " << a.size() << "\n";
    /* begin(): 문자열의 첫번째 요소를 가리키는 이터레이터 반환 */
    cout << char(*a.begin()) << '\n';
    /* end(): 문자열의 마지막 요소 그 다음을 가리키는 이터레이터 반환 */
    cout << char(*(a.end() - 1)) << '\n';
    /**
     * string& insert (size_t pos, const string& str);
     * insert(위치, 문자열)
     * 특정 위치에 문자열 삽입, O(n)의 시간복잡도
     */
    a.insert(0, "test ");
    cout << a << " : " << a.size() << "\n";
    /**
     * string& erase (size_t pos = 0, size_t len = npos)
     * erase(위치, 크기)
     * 특정 위치의 크기만큼 문자열을 지운다, O(n)의 시간복잡도
     */
    a.erase(0, 5);
    cout << a << " : " << a.size() << "\n";
    /*
    size_t find (const string& str, size_t pos = 0);
    특정 문자열을 찾아 위치를 반환, 만약 해당 문자열을 찾지 못할 경우 string::npos 를 반환
    O(n)의 시간복잡도
    string::npos는 size_t 타입의 최대 값을 의미한다.
    size_t 타입의 최대 값은 OS에 따라 달라지며 64비트 운영체제라면 64비트 부호가 없는 최대 정수,
    32비트 운영체제라면 32비트 부호가 없는 최대 정수값을 가진다.
    64비트인 경우 18446744073709551615 라는 값을 가진다.
    */
    auto it = a.find("love");
    if (it != string::npos)
    {
        cout << "포함되어 있다." << '\n';
    }

    cout << it << '\n';
    cout << string::npos << '\n';
    /*
    string substr (size_t pos = 0, size_t len = npos) const;
    substr(위치, 크기)
    특정 위치에서 크기만큼의 문자열을 추출, O(n)의 시간복잡도
    */
    cout << a.substr(5, 2) << '\n';

    ascii();
    func_reverse();

    return 0;
}