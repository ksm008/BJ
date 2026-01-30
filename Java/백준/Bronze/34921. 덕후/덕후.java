import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int otakuPower = 10 + 2 * (25 - A + T);

        sb.append(otakuPower > 0 ? otakuPower : 0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}