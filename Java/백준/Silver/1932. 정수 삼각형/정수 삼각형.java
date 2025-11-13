import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int firstInt = Integer.parseInt(br.readLine());  
  
        int[][] dp = new int[N][N];  
  
        dp[0][0] = firstInt;  
  
        for (int i = 1; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < 1 + i; j++) {  
                int temp = Integer.parseInt(st.nextToken());  
                if (j != 0 && j != i) {  
                     dp[i][j] = temp + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);  
                }  
                else if (j == 0) {  
                    dp[i][j] = temp + dp[i - 1][j];  
                } else {  
                    dp[i][j] = temp + dp[i - 1][j - 1];  
                }  
            }  
        }  
  
        int result = Integer.MIN_VALUE;  
        for (int i = 0; i < N; i++) {  
            if (dp[N - 1][i] > result) {  
                result = dp[N - 1][i];  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}