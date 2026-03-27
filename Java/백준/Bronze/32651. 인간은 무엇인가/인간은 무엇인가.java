import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        if (N % 2024 == 0 && N <= 100000) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}