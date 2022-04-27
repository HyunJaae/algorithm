package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int length = sc.nextInt();
        System.out.println(snail(up, down, length));

    }
    // todo: ACM 호텔
    public static int hotel(int H, int W, int N) {
        // 가로 H, 세로 W, N번째 고객, 방번호 출력
        // H번째 W ... H+1 W 부터 N번째 고객 방번호 출력

        List<Integer> roomList = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            int roomNum = 0;
            roomNum += i * 100;
        }
        return Integer.parseInt(null);
    }
    // todo: 달팽이는 올라가고 싶다.
    public static int snail(int up, int down, int length) {
        // V미터 나무 막대, 낮엔 -A미터, 밤에 +B미터, 정상에선 0 / A > B
        // A만큼 올라가고 B만큼 내려오고, 0 -> 2 2 -> 1
        int day = length / (up - down);
        if(length % (up - down) != 0){
            day++;
        }
        return day;
    }
    // todo: 베르트랑 공준
    public static int theorem(int N) {
        // 소수 - 1과 자기 자신으로만 나누어 지는 수, 2/3/5/7
        int a = 0;
        for(int i = N; i < 2*N; i++) {
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
                a++;
            }
        }
        return  a;
    }
    // todo: 설탕 배달
    public static int sugarDelivery(int N) {
        // 5의 배수 가능, 3의 배수 가능, N % 5 == 3의 배수 가능
        if(N == 4 || N == 7) {
            return -1;
        }
        else if(N % 5 == 0) {
            return N / 5;
        }
        else if(N % 5 == 1 || N % 5 == 3) {
            return ((N / 5) + 1);
        }
        else if(N % 5 == 2 || N % 5 == 4) {
            return (N / 5) + 2;
        }
        return -1;
    }
}
