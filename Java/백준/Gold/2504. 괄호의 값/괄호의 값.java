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
  
        int length = str.length();  
        int result = 0;  
        int temp = 1;  
  
        for (int i = 0; i < length; i++) {  
            char ch = str.charAt(i);  
  
            if (ch == '(') {  
                stack.push(ch);  
                temp *= 2;  
            } else if (ch == '[') {  
                stack.push(ch);  
                temp *= 3;  
            } else if (ch == ')') {  
                if (stack.isEmpty()) {  
                    result = 0;  
                    break;  
                } else {  
                    if (stack.peek() == '(') {  
                        if (str.charAt(i - 1) == '(') {  
                            result += temp;  
                        }  
                        temp /= 2;  
                        stack.pop();  
                    } else {  
                        result = 0;  
                        break;  
                    }  
                }  
            } else if (ch == ']') {  
                if (stack.isEmpty()) {  
                    result = 0;  
                    break;  
                } else {  
                    if (stack.peek() == '[') {  
                        if (str.charAt(i - 1) == '[') {  
                            result += temp;  
                        }  
                        temp /= 3;  
                        stack.pop();  
                    } else {  
                        result = 0;  
                        break;  
                    }  
  
                }  
            }  
        }  
  
        if (!stack.isEmpty()) {  
            result = 0;  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}