import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        double A = Integer.parseInt(st.nextToken());  
        double B = Integer.parseInt(st.nextToken());  
        double M = (B - A) / 400.0;  
        double result = 1 / (1 + Math.pow(10, M));  
  
        sb.append(String.format("%.15f", result)).append("\n");  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}