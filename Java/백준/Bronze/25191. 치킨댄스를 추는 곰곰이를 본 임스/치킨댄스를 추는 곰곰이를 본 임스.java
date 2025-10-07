import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int A = Integer.parseInt(st.nextToken());  
        int B = Integer.parseInt(st.nextToken());  
  
        int viableChicken = A / 2 + B;  
        sb.append(Math.min(viableChicken, N));  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}