import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        double num1 = Double.parseDouble(st.nextToken());  
        double num2 = Double.parseDouble(st.nextToken());  
        double num3 = Double.parseDouble(st.nextToken());  
  
        double result1 = num1 * num2 / num3;  
        double result2 = num1 / num2 * num3;  
  
        int result = (int) Math.max(result1, result2);  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}