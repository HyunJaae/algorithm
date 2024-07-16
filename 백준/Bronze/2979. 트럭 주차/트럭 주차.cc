#include <bits/stdc++.h>
using namespace std;

int A, B, C, a, b, arr[100], result;
int main() {
  cin >> A >> B >> C;

  for (int i = 0; i < 3; i++) {
    cin >> a >> b;
    for (int j = a; j < b; j++) {
      arr[j]++;
    }
  }

  for (int v : arr) {
    if (v == 0) continue;
    if (v == 1) result += A;
    if (v == 2) result += B * 2;
    if (v == 3) result += C * 3;
  }

  cout << result << '\n';
  return 0;
}