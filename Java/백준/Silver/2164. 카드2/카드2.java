import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        // poll은 값을 꺼내서 반환하는 메서드이기 때문에 빼고 바로 넣으면 된다.
        // add 메서드는 실패 시 IllegalStateException 예외를 반환한다. offer는 실패 시 false를 반환한다.

        while(queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        bw.write(queue.peek() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}