import java.io.*;  
import java.util.Comparator;  
import java.util.PriorityQueue;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  
        int dasom = 0;  
        int cnt = 0;  
  
        for (int i = 0; i < N; i++) {  
            int votes = Integer.parseInt(br.readLine());  
            if (i == 0) dasom = votes;  
            else pq.offer(votes);  
        }  
  
        if (N != 1) {  
            while (true) {  
                int highest = pq.poll();  
                if (highest < dasom) break;  
  
                highest -= 1;  
                dasom += 1;  
                cnt++;  
                pq.add(highest);  
            }  
        } else {  
            cnt = 0;  
        }  
  
        sb.append(cnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}