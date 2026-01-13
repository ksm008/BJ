import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        int xMax = Integer.MIN_VALUE; int yMax = Integer.MIN_VALUE;  
        int xMin = Integer.MAX_VALUE; int yMin = Integer.MAX_VALUE;  
  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
            int x = Integer.parseInt(st.nextToken());  
            int y = Integer.parseInt(st.nextToken());  
  
            if (x > xMax) xMax = x;  
            if (y > yMax) yMax = y;  
            if (x < xMin) xMin = x;  
            if (y < yMin) yMin = y;  
        }  
  
        int result = (xMax - xMin) * (yMax - yMin);  
        sb.append(result);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}