import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
    );
    static BufferedWriter bw = new BufferedWriter(
        new OutputStreamWriter(System.out)
    );
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N % M == 0) {
            sb.append(N / M);
        } else {
            sb.append(N / M + 1);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}