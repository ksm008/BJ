import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[N + 1];

        if (N == 1) {
            sb.append("4");
        } else if (N == 2) {
            sb.append("6");
        } else {
            dp[1] = 1;
            dp[2] = 1;

            for (int i = 3; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            long result = dp[N] * 2 +(dp[N] +  dp[N - 1]) * 2;

            sb.append(result);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}