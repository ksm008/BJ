import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        if (X * 2 > D) {
            sb.append("take it");
        } else {
            sb.append("double it");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
