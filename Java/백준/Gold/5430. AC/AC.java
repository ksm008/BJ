import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        outer:  
        for (int i = 0; i < T; i++) {  
            String operation = br.readLine();  
            int arrayLen = Integer.parseInt(br.readLine());  
            String array = br.readLine();  
            array = array.substring(1, array.length() - 1).replaceAll(",", " ");  
            String[] strArray = array.split(" ");  
  
            Deque<Integer> deque;  
  
            if (arrayLen == 0) {  
                deque = new ArrayDeque<>();  
            } else {  
                deque = new ArrayDeque<>();  
  
                for (String str : strArray) {  
                    deque.add(Integer.parseInt(str));  
                }  
            }  
  
            boolean isReversed = false;  
  
            for (int j = 0; j < operation.length(); j++) {  
                char ch = operation.charAt(j);  
  
                if (ch == 'R') {  
                    isReversed = !isReversed;  
                } else {  
                    if (deque.isEmpty()) {  
                        sb.append("error" + "\n");  
                        continue outer;  
                    }  
                    if (isReversed) {  
                        deque.pollLast();  
                    } else {  
                        deque.pollFirst();  
                    }  
                }  
            }  
  
            sb.append("[");  
            int size = deque.size();  
            if (!isReversed) {  
                for (int j = 0; j < size; j++) {  
                    if (j != size - 1) {  
                        sb.append(deque.pollFirst()).append(",");  
                    } else {  
                        sb.append(deque.pollFirst());  
                    }  
                }  
            } else {  
                for (int j = size - 1; j >= 0; j--) {  
                    if (j != 0) {  
                        sb.append(deque.pollLast()).append(",");  
                    } else {  
                        sb.append(deque.pollLast());  
                    }  
                }  
            }  
            sb.append("]\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}