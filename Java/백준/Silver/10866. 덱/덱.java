import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        Deque<Integer> deque = new ArrayDeque<>();  
  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            if (st.countTokens() == 2) {  
                if (st.nextToken().equals("push_front")) {  
                    deque.offerFirst(Integer.parseInt(st.nextToken()));  
                } else {  
                    deque.offerLast(Integer.parseInt(st.nextToken()));  
                }  
            } else {  
                switch (st.nextToken()) {  
                    case "pop_front":  
                        if (deque.isEmpty()) {  
                            sb.append("-1\n");  
                        } else {  
                            sb.append(deque.pollFirst()).append('\n');  
                        }  
                        break;  
                    case "pop_back":  
                        if (deque.isEmpty()) {  
                            sb.append("-1\n");  
                        } else {  
                            sb.append(deque.pollLast()).append('\n');  
                        }  
                        break;  
                    case "front":  
                        if (deque.isEmpty()) {  
                            sb.append("-1\n");  
                        } else {  
                            sb.append(deque.peekFirst()).append('\n');  
                        }  
                        break;  
                    case "back":  
                        if (deque.isEmpty()) {  
                            sb.append("-1\n");  
                        } else {  
                            sb.append(deque.peekLast()).append('\n');  
                        }  
                        break;  
                    case "size":  
                        sb.append(deque.size()).append('\n');  
                        break;  
                    case "empty":  
                        if (deque.isEmpty()) {  
                            sb.append("1").append('\n');  
                        } else {  
                            sb.append("0").append('\n');  
                        }  
                        break;  
                }  
            }  
        }  
  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}