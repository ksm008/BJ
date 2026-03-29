import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        long A = Long.parseLong(st.nextToken());  
        long B = Long.parseLong(st.nextToken());  
  
        long result = A * B;  
        long remain = 0;  
  
        while (true) {  
            remain = A % B;  
  
            if (remain == 0) {  
                result = result / B;  
                break;  
            }  
  
            A = B;  
            B = remain;  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}