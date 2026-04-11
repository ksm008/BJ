import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int N, M;  
    static int[] board;  
  
    static HashMap<Integer, Integer> map = new HashMap<>();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        // 사다리랑 뱀을 한번에 저장하기. ladders랑 snakes로 안나눠도 된다...  
        board = new int[101];  
  
        for (int i = 1; i <= 100; i++) {  
            board[i] = i;  
        }  
  
        N  = Integer.parseInt(st.nextToken());  
        M  = Integer.parseInt(st.nextToken());  
  
        for (int i = 0; i < N; i++) {  
            st = new StringTokenizer(br.readLine());  
            int X = Integer.parseInt(st.nextToken());  
            int Y = Integer.parseInt(st.nextToken());  
            board[X] = Y;  
        }  
  
        for (int i = 0; i < M; i++) {  
            st = new StringTokenizer(br.readLine());  
            int U = Integer.parseInt(st.nextToken());  
            int V = Integer.parseInt(st.nextToken());  
            board[U] = V;  
        }  
  
        int result = bfs();  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int bfs() {  
        boolean[] visited = new boolean[101];  
        Deque<int[]> queue = new ArrayDeque<>();  
        // {현재 위치, 굴린 횟수}  
        queue.offer(new int[]{1, 0});  
        visited[1] = true;  
  
        while (!queue.isEmpty()) {  
            int[] curr = queue.poll();  
            int curPos = curr[0];  
            int curDice = curr[1] + 1;  
  
            for (int i = 1; i <= 6; i++) {  
                int newPos = curPos + i;  
  
                if (newPos > 0 && newPos <= 100) {  
                    newPos = board[newPos];  
                    if (!visited[newPos]) {  
                        visited[newPos] = true;  
                        queue.offer(new int[]{newPos, curDice});  
                    }  
                }  
  
                if (newPos == 100) {  
                    return curDice;  
                }  
            }  
        }  
  
        return -1;  
    }  
}