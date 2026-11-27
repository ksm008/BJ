import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        String list = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
  
        int N = Integer.parseInt(st.nextToken());  
        int B = Integer.parseInt(st.nextToken());  
  
        while (N > 0) {  
            sb.append(list.charAt(N % B));  
            N /= B;  
        }  
  
        bw.write(sb.reverse().toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}