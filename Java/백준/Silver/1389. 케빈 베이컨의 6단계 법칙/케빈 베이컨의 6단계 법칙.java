import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        int[][] dist = new int[N + 1][N + 1];  
  
        for (int i = 1; i <= N; i++) {  
            for (int j = 1; j <= N; j++) {  
                if (i != j) {  
                    dist[i][j] = 5000;  
                } else {  
                    dist[i][j] = 0;  
                }  
            }  
        }  
  
        for (int i = 0; i < M; i++) {  
            st = new StringTokenizer(br.readLine());  
            int A = Integer.parseInt(st.nextToken());  
            int B = Integer.parseInt(st.nextToken());  
  
            dist[A][B] = 1;  
            dist[B][A] = 1;  
        }  
  
        for (int k = 1; k <= N; k++) {  
            for (int i = 1; i <= N; i++) {  
                for (int j = 1; j <= N; j++) {  
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);  
                }  
            }  
        }  
  
        int result = 1;  
        int min = 5000;  
  
        for (int i = 1; i <= N; i++) {  
            int curr = 0;  
  
            for (int j = 1; j <= N; j++) {  
                curr += dist[i][j];  
            }  
  
            if (min > curr) {  
                min = curr;  
                result = i;  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}