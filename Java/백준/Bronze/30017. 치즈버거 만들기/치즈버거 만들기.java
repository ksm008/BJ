import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int A = Integer.parseInt(st.nextToken());  
        int B = Integer.parseInt(st.nextToken());  
  
        if (A > B) {  
            sb.append(B * 2 + 1);  
        } else {  
            sb.append(A * 2 - 1);  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}