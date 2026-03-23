import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        Deque<Character> stack = new ArrayDeque<>();  
        String str = br.readLine();  
        int result = 0;  
  
        for (int i = 0; i < str.length(); i++) {  
            char ch = str.charAt(i);  
            if (ch == '(') {  
                stack.push(ch);  
            } else {  
                stack.pop();  
                if (str.charAt(i - 1) == ')') result++;  
                else result += stack.size();  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}