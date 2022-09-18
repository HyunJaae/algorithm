package algorithm.baekjoon;

import java.io.*;

public class  IO{
    public static void main(String[] args) throws IOException {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");

        System.out.println("\n");

        StringBuilder sb = new StringBuilder();
        sb.append("|\\_/|\n");
        sb.append("|q p|   /}\n");
        sb.append("( 0 )\"\"\"\\\n");
        sb.append("|\"^\"`    |\n");
        sb.append("||_/=\\\\__|");

        System.out.println(sb);

        System.out.println("\n");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("         ,r'\"7");
        bw.newLine();

        bw.write("r`-_   ,'  ,/");
        bw.newLine();

        bw.write(" \\. \". L_r'");
        bw.newLine();

        bw.write("   `~\\/");
        bw.newLine();

        bw.write("      |");
        bw.newLine();

        bw.write("      |");

        bw.flush();
        bw.close();
    }
}
