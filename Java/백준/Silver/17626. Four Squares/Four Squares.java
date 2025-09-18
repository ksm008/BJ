import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];

        dp[0] = 0;
        for (int x = 1; x <= N; x++) {
            int best = Integer.MAX_VALUE;
            for (int i = 1; i * i <= x; i++) {
                int cand = dp[x - i * i] + 1;
                if (cand < best) best = cand;
            }
            dp[x] = best;
        }

        sb.append(dp[N]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
