import java.io.*;  
import java.util.Arrays;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int[] ropes = new int[N];  
  
        for (int i = 0; i < N; i++) {  
            ropes[i] = Integer.parseInt(br.readLine());  
        }  
  
        Arrays.sort(ropes);  
  
        int result = Integer.MIN_VALUE;  
  
        for (int i = 0; i < N; i++) {  
            int mainRope = ropes[i];  
            result = Math.max(result, mainRope * (N - i));  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}