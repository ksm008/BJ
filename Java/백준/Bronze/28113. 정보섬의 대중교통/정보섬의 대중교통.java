import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int A = Integer.parseInt(st.nextToken());  
        int B = Integer.parseInt(st.nextToken());  
  
        if (A < B) {  
            sb.append("Bus");  
        } else if (A > B) {  
            sb.append("Subway");  
        } else {  
            sb.append("Anything");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}