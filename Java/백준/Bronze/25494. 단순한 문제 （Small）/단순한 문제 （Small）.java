import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T =  Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < T; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
            int A = Integer.parseInt(st.nextToken());  
            int B = Integer.parseInt(st.nextToken());  
            int C = Integer.parseInt(st.nextToken());  
  
            int result = Math.min(A, Math.min(B, C));  
            sb.append(result).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}