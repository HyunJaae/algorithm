#include <iostream>

using namespace std;
int maxValue = 0;
int maxValueIndex = 0;
int num;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    for(int i = 0; i < 9; i++) {
        cin >> num;
        if(maxValue < num) {
            maxValue = num;
            maxValueIndex = i;
        }
    }

    cout << maxValue << '\n' << maxValueIndex + 1 << '\n';

    return 0;
}

// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|