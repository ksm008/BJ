import java.io.*;  
import java.util.Deque;  
import java.util.LinkedList;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 큐 가장 뒤에 있는 정수 출력을 위해 Deque를 사용  
  
        int num = Integer.parseInt(br.readLine());  
        Deque<Integer> queue = new LinkedList<>();  
  
        for (int i = 0; i < num; i++) {  
            String[] str = br.readLine().split(" ");  
            String cmd = str[0];  
  
            if (cmd.equals("push")) {  
                queue.offer(Integer.parseInt(str[1]));  
            }  
            else if (cmd.equals("pop")) {  
                if (queue.isEmpty()) bw.write("-1");  
                 else bw.write(queue.poll() + "");  
            }  
            else if (cmd.equals("size")) bw.write(queue.size() + "");  
            else if (cmd.equals("empty")) {  
                if ((queue.isEmpty())) bw.write("1");  
                else bw.write("0");  
            }  
            else if (cmd.equals("front")) {  
                if (queue.isEmpty()) bw.write("-1");  
                else bw.write(queue.peek() + "");  
            }  
            else if (cmd.equals("back")) {  
                if (queue.isEmpty()) bw.write("-1");  
                else bw.write(queue.getLast() + "");  
            }  
            if (!cmd.equals("push")) bw.newLine();  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}