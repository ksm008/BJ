import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
    static int[][] stickers;  
    static int[][] dp;  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < T; i++) {  
            int N = Integer.parseInt(br.readLine());  
  
            stickers = new int[2][N + 1];  
  
            for (int j = 0; j < 2; j++) {  
                st = new StringTokenizer(br.readLine());  
                for (int k = 1; k <= N; k++) {  
                    stickers[j][k] = Integer.parseInt(st.nextToken());  
                }  
            }  
  
            dp = new int[N + 1][3];  
  
            dp[1][1] = stickers[0][1];  
            dp[1][2] = stickers[1][1];  
  
            for (int j = 2; j <= N; j++) {  
                dp[j][0] = Math.max(dp[j - 1][0], Math.max(dp[j - 1][1], dp[j - 1][2]));  
                dp[j][1] = Math.max(dp[j - 1][0], dp[j - 1][2]) + stickers[0][j];  
                dp[j][2] = Math.max(dp[j - 1][0], dp[j - 1][1]) + stickers[1][j];  
            }  
  
            int result = Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2]));  
            sb.append(result).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}