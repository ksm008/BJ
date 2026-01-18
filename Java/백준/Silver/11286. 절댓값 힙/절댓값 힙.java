import java.io.*;  
import java.util.PriorityQueue;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {  
            int abs1 = Math.abs(o1);  
            int abs2 = Math.abs(o2);  
  
            if (abs1 == abs2) return Integer.compare(o1, o2);  
            else return Integer.compare(abs1, abs2);  
        });  
  
        int N = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < N; i++) {  
            int X = Integer.parseInt(br.readLine());  
  
            if (X == 0) {  
                if (pq.isEmpty()) {  
                    sb.append("0").append("\n");  
                } else {  
                    sb.append(pq.poll()).append("\n");  
                }  
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