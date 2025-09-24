import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        int[][] dp = new int[30][30];  
  
        for (int i = 1; i < 30; i++) {  
            dp[i][i] = 1;  
            dp[1][i] = i;  
        }  
  
        for (int i = 2; i < 30; i++) {  
            for (int j = i + 1; j < 30; j++) {  
                dp[i][j] = dp[i][j-1] + dp[i-1][j-1];  
            }  
        }  
  
        for (int i = 0; i < T; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            int N = Integer.parseInt(st.nextToken());  
            int M = Integer.parseInt(st.nextToken());  
  
            sb.append(dp[N][M]).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}