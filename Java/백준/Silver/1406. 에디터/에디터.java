import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        Deque<Character> leftStack = new ArrayDeque<>();  
        Deque<Character> rightStack = new ArrayDeque<>();  
        String str = br.readLine();  
        int length = str.length();  
  
        for (int i = 0; i < length; i++) {  
            char ch = str.charAt(i);  
            leftStack.push(ch);  
        }  
  
        int M = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < M; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            char command = st.nextToken().charAt(0);  
            if (command == 'P') {  
                char ch = st.nextToken().charAt(0);  
                leftStack.push(ch);  
            } else if (command == 'L') {  
                if (!leftStack.isEmpty()) {  
                    rightStack.push(leftStack.pop());  
                }  
            } else if (command == 'D') {  
                if (!rightStack.isEmpty()) {  
                    leftStack.push(rightStack.pop());  
                }  
            } else {  
                if (!leftStack.isEmpty()) leftStack.pop();  
            }  
        }  
  
        while (!leftStack.isEmpty()) {  
            rightStack.push(leftStack.pop());  
        }  
  
        while (!rightStack.isEmpty()) {  
            sb.append(rightStack.pop());  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}