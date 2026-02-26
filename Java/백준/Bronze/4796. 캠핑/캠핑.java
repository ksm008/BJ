import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int cnt = 1;  
        while (true) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            int L = Integer.parseInt(st.nextToken());  
            int P = Integer.parseInt(st.nextToken());  
            int V = Integer.parseInt(st.nextToken());  
  
            if (L == 0 && P == 0 && V == 0) {  
                break;  
            }  
  
            int result = (V / P * L) + Math.min(L ,V % P);  
            sb.append("Case ").append(cnt++).append(": ").append(result).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}