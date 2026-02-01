import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static class timeTable implements Comparable<timeTable> {  
        int start;  
        int end;  
  
        public timeTable(int start, int end) {  
            this.start = start;  
            this.end = end;  
        }  
  
        public int compareTo(timeTable o) {  
            return Integer.compare(this.start, o.start);  
        }  
    }  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        PriorityQueue<Integer> pq = new PriorityQueue<>();  
        ArrayList<timeTable> totalTime = new ArrayList<>();  
  
        for (int i = 0; i <N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
            int start = Integer.parseInt(st.nextToken());  
            int end = Integer.parseInt(st.nextToken());  
  
            totalTime.add(new timeTable(start, end));  
        }  
  
        Collections.sort(totalTime);  
  
        for (int i = 0; i < N; i++) {  
            timeTable t = totalTime.get(i);  
            int start = t.start;  
            int end = t.end;  
  
            if (pq.isEmpty()) {  
                pq.offer(end);  
            } else {  
                int top = pq.peek();  
  
                if (start < top) {  
                    pq.offer(end);  
                } else {  
                    pq.poll();  
                    pq.offer(end);  
                }  
            }  
  
        }  
  
        int result = pq.size();  
        sb.append(result);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}