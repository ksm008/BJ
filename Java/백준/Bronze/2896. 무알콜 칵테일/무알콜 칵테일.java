import java.io.*;  
import java.text.DecimalFormat;  
import java.util.StringTokenizer;  
  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        DecimalFormat df = new DecimalFormat("0.######");  
  
        st = new StringTokenizer(br.readLine());  
  
        double A = Double.parseDouble(st.nextToken());  
        double B = Double.parseDouble(st.nextToken());  
        double C = Double.parseDouble(st.nextToken());  
  
        st = new StringTokenizer(br.readLine());  
  
        double I = Double.parseDouble(st.nextToken());  
        double J = Double.parseDouble(st.nextToken());  
        double K = Double.parseDouble(st.nextToken());  
  
        double min = Math.min(A / I, Math.min(B / J, C / K));  
  
        sb.append(df.format(A - (I * min)))  
                .append(" ")  
                .append(df.format(B - (J * min)))  
                .append(" ")  
                .append(df.format(C - (K * min)));  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}