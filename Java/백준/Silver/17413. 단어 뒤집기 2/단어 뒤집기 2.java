import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
  
        Deque<Character> stack = new ArrayDeque<>();  
        boolean isTag = false;  
  
        for (int i = 0; i < str.length(); i++) {  
            char ch = str.charAt(i);  
  
            if (ch == '<') {  
                while (!stack.isEmpty()) {  
                    sb.append(stack.pop());  
                }  
                isTag = true;  
                sb.append(ch);  
            } else if (ch == '>') {  
                isTag = false;  
                sb.append(ch);  
            } else if (isTag) {  
                sb.append(ch);  
            } else if (ch == ' ') {  
                while (!stack.isEmpty()) {  
                    sb.append(stack.pop());  
                }  
                sb.append(ch);  
            } else {  
                stack.push(ch);  
            }  
        }  
        while (!stack.isEmpty()) {  
            sb.append(stack.pop());  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}