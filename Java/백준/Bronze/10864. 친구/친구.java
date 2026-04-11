import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        int[] friends = new int[N + 1];  
  
        for (int i = 0; i < M; i++) {  
            st = new StringTokenizer(br.readLine());  
  
            int A = Integer.parseInt(st.nextToken());  
            int B = Integer.parseInt(st.nextToken());  
  
            friends[A]++;  
            friends[B]++;  
        }  
  
        for (int i = 1; i <= N; i++) {  
            sb.append(friends[i]).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}