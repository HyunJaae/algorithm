import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        SugarDelivery sugarDelivery = new SugarDelivery();
        System.out.println(sugarDelivery.sugarDelivery(N));
    }


}
class SugarDelivery {
    public int sugarDelivery(int N) {

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