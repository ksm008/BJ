import java.io.*;  
import java.util.PriorityQueue;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
  
    public static void main(String[] args) throws IOException {  
        PriorityQueue<Integer> pq = new PriorityQueue<>();  
        int N = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < N; i++) {  
            pq.offer(Integer.parseInt(br.readLine()));  
        }  
  
        if (N == 1) {  
            sb.append(0);  
        } else {  
            int result = 0;  
  
            while (pq.size() > 1) {  
                int first = pq.poll();  
                int second = pq.poll();  
                int sum = first + second;  
                result += sum;  
                pq.offer(sum);  
            }  
  
            sb.append(result);  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}