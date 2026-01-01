import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int totalRep = (int) Math.pow(2, N) - 1;  
  
  
        sb.append(totalRep).append("\n");  
        hanoiTower(N, 1, 3, 2);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void hanoiTower(int n, int start, int end, int stopover) {  
        if (n == 1) {  
            sb.append(start).append(" ").append(end).append("\n");  
            return;  
        }  
  
        hanoiTower(n - 1, start, stopover, end);  
        sb.append(start).append(" ").append(end).append('\n');  
        hanoiTower(n - 1, stopover, end, start);  
    }  
}