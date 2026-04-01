import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int W, H;  
    static int[][] map;  
    static boolean[][] visited;  
  
    public static void main(String[] args) throws IOException {  
        while (true) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
            W = Integer.parseInt(st.nextToken());  
            H = Integer.parseInt(st.nextToken());  
  
            if (W == 0 && W == H) {  
                break;  
            }  
  
            map = new int[H][W];  
            visited = new boolean[H][W];  
  
            for (int i = 0; i < H; i++) {  
                st = new StringTokenizer(br.readLine());  
                for (int j = 0; j < W; j++) {  
                    map[i][j] = Integer.parseInt(st.nextToken());  
                }  
            }  
  
            int result = 0;  
  
            for (int i = 0; i < H; i++) {  
                for (int j = 0; j < W; j++) {  
                    if (map[i][j] == 1 && !visited[i][j]) {  
                        bfs(i, j);  
                        result++;  
                    }  
                }  
            }  
            sb.append(result).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void bfs(int cy, int cx) {  
        Deque<int[]> queue = new ArrayDeque<>();  
        queue.add(new int[]{cy, cx});  
  
        int[] dy = {-1, 1, 0, 0, 1, 1, -1, -1};  
        int[] dx = {0, 0, -1, 1, 1, -1, 1, -1};  
  
        while (!queue.isEmpty()) {  
            int[] curr = queue.poll();  
  
            int y = curr[0];  
            int x = curr[1];  
  
            visited[y][x] = true;  
  
            for (int i = 0; i < 8; i++) {  
                int ny = y + dy[i];  
                int nx = x + dx[i];  
  
                if (ny >= 0 && ny < H && nx >= 0 && nx < W && !visited[ny][nx] && map[ny][nx] == 1) {  
                    queue.offer(new int[]{ny, nx});  
                    visited[ny][nx] = true;  
                }  
            }  
        }  
    }  
}