import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringBuilder를 사용하여 문자열을 저장하고, 만약 푸시나 팝 둘 다 불가능하다면 NO를 출력하게 해야함.

        int num = Integer.parseInt(br.readLine());
        int[] lists = new int[num];

        for (int i = 0; i < num; i++) {
            lists[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int current = 1;
        int idx = 0;

        StringBuilder sb = new StringBuilder();

        while (current <= num || !stack.isEmpty()) {
            if (current <= num && (stack.isEmpty() || stack.peek() < lists[idx])) {
                stack.push(current++);
                sb.append("+\n");
            } else if (stack.peek() == lists[idx]) {
                stack.pop();
                sb.append("-\n");
                idx++;
            } else {
                bw.write("NO");
                bw.flush();
                return;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}