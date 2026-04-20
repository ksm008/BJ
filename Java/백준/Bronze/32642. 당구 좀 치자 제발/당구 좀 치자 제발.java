import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        long N = Long.parseLong(br.readLine());  
        long rage =  0;  
        long result = 0;  
  
        st = new StringTokenizer(br.readLine());  
        for (int i = 0; i < N; i++) {  
            int weather = Integer.parseInt(st.nextToken());  
  
            if (weather == 1) {  
                rage++;  
            } else {  
                rage--;  
            }  
            result += rage;  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}