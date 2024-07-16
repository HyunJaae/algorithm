import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        int temp;
        for (int i=0; i<28; i++) {
            temp = Integer.parseInt(br.readLine());
            arr[temp] = true;
        }
        for (int i=1; i<=30; i++) {
            if (!arr[i]) System.out.println(i);
        }
    }
}