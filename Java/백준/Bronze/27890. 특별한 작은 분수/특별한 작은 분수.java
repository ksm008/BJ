import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x0 = Integer.parseInt(st.nextToken());
        int N =  Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            if (x0 % 2 == 0) x0 = (x0 / 2) ^ 6;
            else x0 = (2 * x0) ^ 6;
        }

        sb.append(x0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
