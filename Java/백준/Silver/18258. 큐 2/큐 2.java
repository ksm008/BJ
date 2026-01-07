import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (!st.hasMoreTokens()) {
                switch (str) {
                    case "pop":
                        if (queue.isEmpty()) {
                            sb.append(-1).append("\n");
                        } else {
                            sb.append(queue.poll()).append("\n");
                        }
                        break;
                    case "size":
                        sb.append(queue.size()).append("\n");
                        break;
                    case "empty":
                        if (queue.isEmpty()) {
                            sb.append(1).append("\n");
                        } else {
                            sb.append(0).append("\n");
                        }
                        break;
                    case "front":
                        if (queue.isEmpty()) {
                            sb.append(-1).append("\n");
                        } else {
                            sb.append(queue.peek()).append("\n");
                        }
                        break;
                    case "back":
                        if (queue.isEmpty()) {
                            sb.append(-1).append("\n");
                        } else {
                            sb.append(queue.peekLast()).append("\n");
                        }
                        break;
                }
            } else {
                int X = Integer.parseInt(st.nextToken());
                queue.offer(X);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}