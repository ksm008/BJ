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
        int N = Integer.parseInt(br.readLine());
        int[][] counsel = new int[N + 1][2];
        int[] dp = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int counselDay = Integer.parseInt(st.nextToken());
            int couselProfit = Integer.parseInt(st.nextToken());

            counsel[i][0] = counselDay;
            counsel[i][1] = couselProfit;
        }

        for (int i = N; i >= 1; i--) {
            if (i + counsel[i][0] > N + 1) {
                dp[i] = dp[i + 1];
            } else if (i + counsel[i][0] <= N + 1) {
                dp[i] = Math.max(
                    dp[i + 1],
                    counsel[i][1] + dp[i + counsel[i][0]]
                );
            }
        }
        sb.append(dp[1]).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}