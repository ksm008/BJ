import java.io.*;  
import java.util.LinkedList;  
import java.util.Queue;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 원형 연결 리스트로 해도 되지만... 큐를 만들어서 가장 위에 있는 숫자를 아래로 넣는 작업을 3번씩 반복...  
        // 그리고 가장 위에 있는 숫자를 pop 시키면 된다. 이걸 큐가 전부 빌 때까지 진행.  
        // if문에 문장이 하나만 있어도 중괄호 쓰는 버릇 들이기. 중괄호 없으면 가독성이 별로...  
  
        Queue<Integer> josephus = new LinkedList<>();  
        String[] str = br.readLine().split(" ");  
  
        int total = Integer.parseInt(str[0]);  
        int eliNum = Integer.parseInt(str[1]);  
  
        for (int i = 1; i <= total; i++) {  
            josephus.offer(i);  
        }  
  
        bw.write("<");  
        while (!josephus.isEmpty()) {  
            for (int i = 0; i < eliNum - 1; i++) {  
                josephus.offer(josephus.poll());  
            }  
  
            if (josephus.size() == 1) {  
                bw.write(josephus.poll() + ">");  
            }  
            else {  
                bw.write(josephus.poll() + ", ");  
            }  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}