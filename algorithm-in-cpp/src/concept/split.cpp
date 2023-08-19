#include <bits/stdc++.h>
using namespace std;

int func_atoi()
{
    string s = "1";
    string s2 = "amumu";
    cout << atoi(s.c_str()) << " : 정수형인 경우" << '\n';
    cout << atoi(s2.c_str()) << " : 문자열인 경우" << '\n';
    return 0;
}

string a[2] = {"out of time", "i love you"};
int func_vector()
{
    for (string b : a)
        cout << b << '\n';

    for (int i = 0; i < 2; i++)
        cout << a[i] << '\n';
    return 0;
}

vector<string> split(string input, string delimiter)
{
    vector<string> ret;
    long long pos = 0;
    string token = "";
    /*
    split은 아래의 while문만 외우면 된다.
    string::npos 란 -1 값을 가지는 상수로 find() 함수 수행 시에 찾는 문자열이 없을 때 반환된다.
    */
    while ((pos = input.find(delimiter)) != string::npos)
    {
        cout << "delimiter index = " << pos << '\n';
        token = input.substr(0, pos);
        ret.push_back(token);
        input.erase(0, pos + delimiter.length());
    }
    ret.push_back(input);
    return ret;
}

int main()
{
    string s = "안녕하세요 천재입니다. 정말이에요!", d = " ";
    vector<string> a = split(s, d);
    for (string b : a)
        cout << b << '\n';

    cout << "=========범위기반 for 루프==========" << '\n';
    func_vector();
    cout << "========문자열이 정수형인지 확인=========" << '\n';
    func_atoi();
}