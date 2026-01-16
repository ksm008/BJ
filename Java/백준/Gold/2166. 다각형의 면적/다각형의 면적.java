import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        long[] xArray = new long[N + 1];  
        long[] yArray = new long[N + 1];  
  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
            long x = Long.parseLong(st.nextToken());  
            long y = Long.parseLong(st.nextToken());  
  
            xArray[i] = x;  
            yArray[i] = y;  
        }  
  
        long A = 0;  
        for (int i = 0; i < N; i++) {  
            A += xArray[i] * yArray[(i + 1) % N];  
        }  
  
        long B = 0;  
        for (int i = 0; i < N; i++) {  
            B += yArray[i] * xArray[(i + 1) % N];  
        }  
  
        double result = Math.abs((A - B)) / 2.0;  
  
        sb.append(String.format("%.1f", result));  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}