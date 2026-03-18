import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int[] wines = new int[N + 1];  
        int[] dp = new int[N + 1];  
  
        for (int i = 1; i <= N; i++) {  
            int wine = Integer.parseInt(br.readLine());  
            wines[i] = wine;  
        }  
  
        if (N != 1) {  
            dp[1] = wines[1];  
            dp[2] = Math.max(dp[1], wines[1] + wines[2]);  
  
            for (int i = 3; i <= N; i++) {  
                dp[i] = Math.max(dp[i - 1], Math.max(wines[i] + dp[i - 2], dp[i - 3] + wines[i] + wines[i - 1]));  
            }  
        } else {  
            dp[1] = wines[1];  
        }  
  
        sb.append(dp[N]);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}