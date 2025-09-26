import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > '@') sb.append(ch);
            else if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') sb.append(stack.pop());
                if (!stack.isEmpty()) stack.pop();
            } else {
                while (!stack.isEmpty() && calcPower(stack.peek()) >= calcPower(ch)) sb.append(stack.pop());
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) sb.append(stack.pop());

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int calcPower(char ch) {
        if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else if (ch == '(') return 0;
        return -1;
    }
}
