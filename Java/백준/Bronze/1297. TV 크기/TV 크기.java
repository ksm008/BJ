import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        double D = Integer.parseInt(st.nextToken());  
        double H = Integer.parseInt(st.nextToken());  
        double W = Integer.parseInt(st.nextToken());  
  
        double rate = Math.sqrt((D * D) / ((H * H) + (W * W)));  
  
        sb.append((int) (H * rate)).append(" ").append((int) (W * rate));  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}