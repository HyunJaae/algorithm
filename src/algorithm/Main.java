package algorithm;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            System.out.println(bracket(sc.next()));
        }
    }
    // todo: 괄호
    public static String bracket(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            } else if(stack.empty()){
                return "No";
            } else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        } else {
            return "NO";
        }
    }
    // todo: 회전하는 큐(양방향 큐)
    public static void turnQueue(Scanner sc){
        LinkedList<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        int i = 0;
        for(; i < N; i++){
            queue.offer(i);
        }
        int[] ints = new int[M];

        for(; i < M; i++){
            ints[i] = sc.nextInt();
        }
        // ints 수의 위치 찾고
        for(; i < M; i++){

        }
    }
    // todo: 스택 수열
    public static void stacks(Scanner sc) {
        int a = 0;
        int c = 0;
        int b = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Integer[] integers = new Integer[b];
        while (a < b) {
            integers[a] = sc.nextInt();
            a++;
            for(int i = c+1; i <= integers[a]; i++){
                stack.push(i);
                c++;
                System.out.println("+");
                if(i == integers[a]){
                    stack.pop();
                    System.out.println("-");
                }
            }
        }
    }
    // todo: 제로
    public static void zero(Scanner sc){
        int T = sc.nextInt();
        Stack<Integer> integers = new Stack<>();
        int i = 0;
        int a = 0;
        for(i = 0; i < T; i++) {
            int t = sc.nextInt();
            if(t == 0) {
                integers.pop();
                // 0이 중복으로 들어오면 어떻게 해야되냐고!!!!
            }
            integers.push(t);
        }
        while (i < integers.size()) {

        }
        System.out.println(a);
    }
    // todo: 스택 (java의 자료 구조 중 하나로 나중에 들어간 것이 먼저 나오는 특징을 가졌다.) / 시간 초과!
    public static void stack(Scanner sc){
        int T = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            String string = sc.next();

            switch (string) {
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    int a = (stack.isEmpty()) ? -1 : stack.pop();
                    System.out.println(a);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    int b = (stack.isEmpty()) ? 1 : 0;
                    System.out.println(b);
                    break;
                case "top":
                    int c = (stack.isEmpty()) ? -1 : stack.peek();
                    System.out.println(c);
                    break;
            }
        }
    }
    // todo: 터렛
    public static void turret(int r1, int x1, int y1, int r2, int x2, int y2) {
        // 조규현(x1, y1), 백승환(x2, y2), 류재명(x3, y3)
        int x3;
        int y3;
    }
    // todo: Fly me to the Alpha Centauri
    public static void centauri(int x, int y) {
        // 처음 위치 x, 도착 위치 y, 이동 거리 i-1, i, i+1
        // 처음 이동거리 1, 마지막 이동거리 1 로 고정
        int 거리 = (y - x)/2;
        int 이동거리 = 1;
        int 이동횟수 = 0;
        while (이동거리 == 거리) {
            x += 이동거리;
            이동거리++;
            이동횟수++;
        }
    }
    // todo: 소수 구하기
    public static int prime(int M, int N) {
        System.out.println(M);
        // M 이상 N 이하의 모든 소수를 출력
        for(int i = M; i <= N; i++){
            if(isPrime(i)){
                System.out.println(i);
                return 0;
            }
        }
        return 0;
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

    // 소수 함수
    public static boolean isPrime(int num){
        if(num<2)
            return false;

        for(int i=2; i*i<=num; i++){  //
            if(num % i == 0)
                return false;
        }
        return true;
    }
}