import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int N;  
  
    public static void main(String[] args) throws IOException {  
        N = Integer.parseInt(br.readLine());  
  
        int[][] map = new int[N][N];  
        int maxHeight = Integer.MIN_VALUE;  
        int safeArea = 1;  
  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < N; j++) {  
                map[i][j] = Integer.parseInt(st.nextToken());  
                if (map[i][j] > maxHeight) {  
                    maxHeight = map[i][j];  
                }  
            }  
        }  
  
        for (int i = 1; i <= maxHeight; i++) {  
            int result = bfs(i, map);  
            if (result > safeArea) {  
                safeArea = result;  
            }  
        }  
  
        sb.append(safeArea);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int bfs(int rainHeight, int[][] map) {  
        int[] dy = {1, -1, 0, 0};  
        int[] dx = {0, 0, 1, -1};  
        boolean[][] visited = new boolean[N][N];  
  
        int areaCnt = 0;  
  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < N; j++) {  
                if (map[i][j] > rainHeight && !visited[i][j]) {  
                    areaCnt++;  
                    Deque<int[]> queue = new ArrayDeque<>();  
                    queue.offer(new int[]{i, j});  
                    visited[i][j] = true;  
  
                    while (!queue.isEmpty()) {  
                        int[] cur = queue.poll();  
                        int col = cur[0];  
                        int row = cur[1];  
  
                        for (int k = 0; k < 4; k++) {  
                            int dCol = col + dy[k];  
                            int dRow = row + dx[k];  
  
                            if (dCol >= 0 && dCol < N && dRow >= 0 && dRow < N) {  
                                if (map[dCol][dRow] > rainHeight && !visited[dCol][dRow]) {  
                                    queue.offer(new int[]{dCol, dRow});  
                                    visited[dCol][dRow] = true;  
                                }  
                            }  
                        }  
                    }  
                }  
            }  
        }  
        return areaCnt;  
    }  
}