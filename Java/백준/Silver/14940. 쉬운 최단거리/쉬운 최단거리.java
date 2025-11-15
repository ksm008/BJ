import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        int[][] map = new int[N][M];  
        int[] startPoint = new int[1];  
  
        for (int i = 0; i < N; i++) {  
            st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < M; j++) {  
                map[i][j] = Integer.parseInt(st.nextToken());  
                if (map[i][j] == 2) {  
                    startPoint = new int[]{i, j};  
                } else if (map[i][j] == 1) {  
                    map[i][j] = -1;  
                }  
            }  
        }  
  
        bfs(startPoint, map, N, M);  
  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < M; j++) {  
                if (j != M - 1) {  
                    sb.append(map[i][j]).append(" ");  
                } else {  
                    sb.append(map[i][j]);  
                }  
  
            }  
            sb.append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void bfs(int[] startPoint, int[][] map, int N, int M) {  
        int[] dCol = {-1, 1, 0, 0};  
        int[] dRow = {0, 0, -1, 1};  
  
        Deque<int[]> queue = new ArrayDeque<>();  
        boolean[][] visited = new boolean[N][M];  
  
        queue.offer(startPoint);  
        visited[startPoint[0]][startPoint[1]] = true;  
        map[startPoint[0]][startPoint[1]] = 0;  
  
        while (!queue.isEmpty()) {  
            int[] cur = queue.poll();  
            int col = cur[0];  
            int row = cur[1];  
  
            for (int i = 0; i < 4; i++) {  
                int newCol = col + dCol[i];  
                int newRow = row + dRow[i];  
  
                if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < M) {  
                    if (map[newCol][newRow] == -1 && !visited[newCol][newRow]) {  
                        map[newCol][newRow] = map[col][row] + 1;  
                        queue.offer(new int[]{newCol, newRow});  
                        visited[newCol][newRow] = true;  
                    }  
                }  
            }  
        }  
    }  
}