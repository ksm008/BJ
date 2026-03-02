import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int STR =  Integer.parseInt(st.nextToken());
        int DEX = Integer.parseInt(st.nextToken());
        int INT = Integer.parseInt(st.nextToken());
        int LUK = Integer.parseInt(st.nextToken());
        int N =  Integer.parseInt(st.nextToken());

        int total = STR + DEX + INT + LUK;

        int result = 0;
        if (N * 4 > total) result = N * 4 - total;

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}