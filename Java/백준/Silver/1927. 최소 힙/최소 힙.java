import java.io.*;  
import java.util.PriorityQueue;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        PriorityQueue<Integer> pq = new PriorityQueue<>();  
  
        for (int i = 0; i < N; i++) {  
            int X = Integer.parseInt(br.readLine());  
  
            if (X == 0) {  
                if (pq.isEmpty()) sb.append("0").append("\n");  
                else sb.append(pq.poll()).append("\n");  
            } else {  
                pq.offer(X);  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}