import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int sum =  Integer.parseInt(st.nextToken());  
        int sub = Integer.parseInt(st.nextToken());  
  
        if ((sum + sub) % 2 != 0) {  
            sb.append(-1);  
        } else {  
            int big = (sum + sub) / 2;  
            int small = sum - big;  
  
            if (big < 0 || small < 0 || big - small != sub) {  
                sb.append(-1);  
            } else {  
                sb.append(big).append(" ").append(small);  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}