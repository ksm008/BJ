import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        boolean baekjoon = N >= 1000;
        boolean maplestory = U >= 8000 || L >= 260;

        if (baekjoon && maplestory) sb.append("Very Good");
        else if (baekjoon) sb.append("Good");
        else sb.append("Bad");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}