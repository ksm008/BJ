import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        double a = Integer.parseInt(st.nextToken());  
        double b = Integer.parseInt(st.nextToken());  
  
        double percent = b / 100.0;  
        double calculatedDef = a - a * percent;  
        if (calculatedDef < 100) sb.append("1");  
        else sb.append("0");  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}