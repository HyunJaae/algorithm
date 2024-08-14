class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] keyCnt = new int[26]; // 알파벳별 최소 위치 입력할 배열
        for (String key : keymap) {
            char[] chars = key.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int n = chars[i] - 'A'; // 하나의 키에 할당된 문자
                if (keyCnt[n] == 0) keyCnt[n] = i + 1; // 처음 나온 문자인 경우
                else if (keyCnt[n] > i + 1) keyCnt[n] = i + 1; // 문자의 인덱스가 기존 것보다 작은 경우
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for (char t : targets[i].toCharArray()) {
                int kc = keyCnt[t - 'A'];
                if (kc == 0) { // 작성할 문자가 자판에 없는 경우
                    cnt = -1;
                    break;
                }
                cnt += kc;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}