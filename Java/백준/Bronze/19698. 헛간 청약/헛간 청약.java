import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int W = Integer.parseInt(st.nextToken());  
        int H = Integer.parseInt(st.nextToken());  
        int L = Integer.parseInt(st.nextToken());  
  
        int viableCows = (W / L) * (H / L);  
  
        sb.append(Math.min(N, viableCows));  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}