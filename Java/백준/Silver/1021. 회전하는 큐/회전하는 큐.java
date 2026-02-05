import java.io.*;  
import java.util.LinkedList;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        LinkedList<Integer> deque = new LinkedList<>();  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        for (int i = 1; i <= N; i++) {  
            deque.offer(i);  
        }  
  
        st = new StringTokenizer(br.readLine());  
        int result = 0;  
  
        for (int i = 0; i < M; i++) {  
            int curr = Integer.parseInt(st.nextToken());  
            int half = deque.size() / 2;  
  
            if (deque.indexOf(curr) <= half) {  
                while (deque.peekFirst() != curr) {  
                    deque.offerLast(deque.pollFirst());  
                    result++;  
                }  
            } else {  
                while (deque.peekFirst() != curr) {  
                    deque.offerFirst(deque.pollLast());  
                    result++;  
                }  
            }  
            deque.pollFirst();  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}