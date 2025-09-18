import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int[] pn = new int[1001];

        pn[1] = 1;
        pn[2] = 3;

        for (int i = 3; i <= N; i++) {
            pn[i] = (pn[i - 1] + 2 * pn[i - 2]) % 10007;
        }

        sb.append(pn[N]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
