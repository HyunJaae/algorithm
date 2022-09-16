package algorithm.concept;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;

        byte[] a = new byte[10];
        inputStream.read(a);

        for (byte val : a) {
            System.out.println((char)val);
        }

        Scanner scanner = new Scanner(inputStream);
        int b = scanner.nextInt();
        System.out.println(b);

        InputStreamReader sr = new InputStreamReader(inputStream);
    }
}
