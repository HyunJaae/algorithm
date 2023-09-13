#include <iostream>
#include <vector>
using namespace std;

vector<char> split(string input) {
    vector<char> ret;
    int length = input.length();
    for (int i = 0; i < length; i++) {
        char s = *input.begin();
        ret.push_back(s);
        input.erase(0, 1);
    }
    return ret;
}
// given 소문자로 이루어진 영어 단어
// 영어 단어에서 알파벳이 몇 개씩 있는지 확인
// apple -> 10001000000100020000000000
// 1. 영단어 -> 알파벳으로 분리
// 2. 알파벳 배열과 비교해서 인덱스 값 구하기
// 3. 0으로 초기화된 알파벳 배열과 동일한 길이의 배열의 해당 인덱스 값에 +1
string s;
char alphabet[26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
int result[26]{};
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> s;
    vector<char> v = split(s);
    for (int i = 0; i < 26; i++) {
        for (char j : v) {
            if (alphabet[i] == j) {
                result[i] = result[i] + 1;
            }
        }
    }

    for (int i : result) cout << i << ' ';
    cout << '\n';
    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|