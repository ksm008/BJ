import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        long prev = Long.parseLong(st.nextToken());  
        int result = 1;  
  
        for (int i = 1; i < N; i++) {  
            long num = Long.parseLong(st.nextToken());  
            if (num == prev) {  
                result = 0;  
                break;  
            } else {  
                prev = num;  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}