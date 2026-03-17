import java.io.*;  
import java.util.ArrayDeque;  
import java.util.ArrayList;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static int N, K;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        N = Integer.parseInt(st.nextToken());  
        K = Integer.parseInt(st.nextToken());  
  
        sb.append(bfs());  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int bfs() {  
        boolean[] visited = new boolean[100001];  
  
        if (N == K) return 0;  
  
        Deque<int[]> queue = new ArrayDeque<>();  
        queue.add(new int[]{N, 0});  
  
        while (!queue.isEmpty()) {  
            int[] cur = queue.poll();  
            int curNum = cur[0];  
            int curTime = cur[1];  
  
            if (visited[curNum]) continue;  
            visited[curNum] = true;  
            if (curNum == K) return curTime;  
  
            ArrayList<int[]> list = new ArrayList<>();  
            list.add(new int[]{curNum * 2, curTime});  
            list.add(new int[]{curNum + 1, curTime + 1});  
            list.add(new int[]{curNum - 1, curTime + 1});  
  
            for (int i = 0; i < 3; i++) {  
                int nextNum = list.get(i)[0];  
                int nextTime = list.get(i)[1];  
  
                if (nextNum >= 0 && nextNum < 100001 && !visited[nextNum]) {  
                    if (i != 0) {  
                        queue.addLast(new int[]{nextNum, nextTime});  
                    } else {  
                        queue.addFirst(new int[]{nextNum, nextTime});  
                    }  
                }  
            }  
        }  
        return -1;  
    }  
}