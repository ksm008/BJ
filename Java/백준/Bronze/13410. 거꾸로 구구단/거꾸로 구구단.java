import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int K = Integer.parseInt(st.nextToken());  
        int max = Integer.MIN_VALUE;  
  
        for (int i = 1; i <= K; i++) {  
            int temp = N * i;  
            sb.append(temp);  
            sb.reverse();  
            int newTemp = Integer.parseInt(sb.toString());  
            sb.setLength(0);  
  
            if (newTemp > max) {  
                max = newTemp;  
            }  
        }  
  
        sb.append(max);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}