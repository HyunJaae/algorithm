#include <bits/stdc++.h>

using namespace std;

/**
 * 개행문자를 포함한 문자열을 받을 때는 getline을 사용한다.
 * T개의 getline을 받을 때는 특정 문자열을 기반으로 버퍼 플래시를 하고 받아야 한다.
 * 그 이유는 cin으로 입력을 받을 때 개행 문자까지 입력을 받게 되면
 * 중간에 위치한 버퍼에 \n 이 남아있게 되는데 이를 없애주기 위해 getline(cin, 특정문자열); 을 사용한다.
 * (keyboard -> Input Buffer -> Program)
 */
int T;
string s;
int main()
{
    cin >> T;
    string bufferflush;
    getline(cin, bufferflush);
    for (int i = 0; i < T; i++)
    {
        getline(cin, s);
        cout << s << "\n";
    }

    return 0;
}