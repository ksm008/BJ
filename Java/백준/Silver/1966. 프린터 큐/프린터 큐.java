import java.io.*;  
import java.util.LinkedList;  
import java.util.Queue;  
  
public class Main {  
    static class Document {  
        int idx;  
        int priority;  
  
        Document(int idx, int priority) {  
            this.idx = idx;  
            this.priority = priority;  
        }  
    }  
  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int num = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < num; i++) {  
            String[] str = br.readLine().split(" ");  
            int queueSize = Integer.parseInt(str[0]);  
            int idx = Integer.parseInt(str[1]);  
  
            str = br.readLine().split(" ");  
            Queue<Document> queue = new LinkedList<>();  
  
            for (int j = 0; j < queueSize; j++) {  
                queue.offer(new Document(j, Integer.parseInt(str[j])));  
            }  
  
            int cnt = 0;  
  
            while (!queue.isEmpty()) {  
                Document now = queue.poll();  
                boolean hasHigher = false;  
  
                for (Document doc : queue) {  
                    if (doc.priority > now.priority) {  
                        hasHigher = true;  
                        break;  
                    }  
                }  
  
                if (hasHigher) {  
                    queue.offer(now);  
                } else {  
                    cnt++;  
                    if (now.idx == idx) {  
                        bw.write(cnt + "\n");  
                        break;  
                    }  
                }  
            }  
        }  
  
        bw.flush();  
        br.close();  
        bw.close();  
    }  
}