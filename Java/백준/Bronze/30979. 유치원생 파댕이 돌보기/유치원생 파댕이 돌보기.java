import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int candy = 0;
        for (int i = 0; i < N; i++) {
            candy += Integer.parseInt(st.nextToken());
        }

        if (candy >= T) sb.append("Padaeng_i Happy");
        else if (candy <= T) sb.append("Padaeng_i Cry");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}