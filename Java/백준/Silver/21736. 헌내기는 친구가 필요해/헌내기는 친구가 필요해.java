import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int N, M, startY, startX;  
    static char[][] campus;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        N  = Integer.parseInt(st.nextToken());  
        M  = Integer.parseInt(st.nextToken());  
  
        campus = new char[N][M];  
  
        startY = 0;  
        startX = 0;  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            for (int j = 0; j < M; j++) {  
                char ch = str.charAt(j);  
                campus[i][j] = ch;  
                if (ch == 'I') {  
                    startY = i;  
                    startX = j;  
                }  
            }  
        }  
  
        int result = bfs();  
  
        if (result == 0) {  
            sb.append("TT");  
        } else {  
            sb.append(result);  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int bfs() {  
        boolean[][] visited = new boolean[N][M];  
  
        int[] dy = {-1, 1, 0, 0};  
        int[] dx = {0, 0, -1, 1};  
  
        Deque<int[]> queue = new ArrayDeque<>();  
        queue.add(new int[] {startY, startX});  
  
        visited[startY][startX] = true;  
        int cnt = 0;  
  
        while (!queue.isEmpty()) {  
            int[] cur =  queue.poll();  
            int curY = cur[0];  
            int curX = cur[1];  
  
            for (int i = 0; i < 4; i++) {  
                int newY = curY + dy[i];  
                int newX = curX + dx[i];  
  
                if (newY >= 0 && newY < N && newX >= 0 && newX < M && !visited[newY][newX]) {  
                    char newCh =  campus[newY][newX];  
                    if (newCh == 'P') {  
                        visited[newY][newX] = true;  
                        queue.add(new int[] {newY, newX});  
                        cnt++;  
                    } else if (newCh != 'X') {  
                        visited[newY][newX] = true;  
                        queue.add(new int[] {newY, newX});  
                    }  
                }  
            }  
        }  
  
        return cnt;  
    }  
}