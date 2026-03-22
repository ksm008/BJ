import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        long[] dp = new long[1000001];  
  
        dp[1] = 1;  
        dp[2] = 2;  
  
        if (N != 1){  
            for (int i = 3; i <= N; i++) {  
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;  
            }  
        }  
  
        sb.append(dp[N]);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}