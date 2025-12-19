import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        long R = Integer.parseInt(st.nextToken());  
        long C = Integer.parseInt(st.nextToken());  
        int N = Integer.parseInt(st.nextToken());  
  
        if (R % N != 0) {  
            R = R / N + 1;  
        } else {  
            R /= N;  
        }  
  
        if (C % N != 0) {  
            C = C / N + 1;  
        } else {  
            C /= N;  
        }  
  
        long result = R * C;  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}