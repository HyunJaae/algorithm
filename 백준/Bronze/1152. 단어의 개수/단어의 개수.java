import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int count = 0;
        int preStr = 32;
        int str;
        
        while (true) {
            str = System.in.read();
            
            // 입력 받은 문자가 공백일 경우
            if (str == 32) {
                // 이전의 문자가 공백이 아니면
                if (preStr != 32) count++;
            } else if (str == 10) { // 입력 받은 문자가 개행일 때('\n')
                if (preStr != 32) count++;
                break;
            }
            preStr = str;
        }

        System.out.println(count);
    }
}