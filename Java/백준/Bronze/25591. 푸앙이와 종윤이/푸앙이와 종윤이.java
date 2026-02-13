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
  
        int A = 100 - N;  
        int B = 100 - M;  
        int C = 100 - (A + B);  
        int D = A * B;  
        int Q = D / 100;  
        int R = D % 100;  
  
        sb.append(A + " " + B + " " + C + " " + D + " " + Q + " " + R + '\n');  
        sb.append((C + Q) + " " + R);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}