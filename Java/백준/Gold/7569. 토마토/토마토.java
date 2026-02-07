import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static Deque<int[]> deque = new ArrayDeque<>();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int M = Integer.parseInt(st.nextToken());  
        int N = Integer.parseInt(st.nextToken());  
        int H = Integer.parseInt(st.nextToken());  
  
        int[][][] tomatoes = new int[H][N][M];  
  
        for (int k = 0; k < H; k++) {  
            for (int i = 0; i < N; i++) {  
                st = new StringTokenizer(br.readLine());  
                for (int j = 0; j < M; j++) {  
                    tomatoes[k][i][j] = Integer.parseInt(st.nextToken());  
  
                    if (tomatoes[k][i][j] == 1) {  
                        deque.offer(new int[]{k, i, j});  
                    }  
                }  
            }  
        }  
  
        int result = 0;  
  
        bfs(M, N, H, tomatoes);  
  
        outer:  
        for (int k = 0; k < H; k++) {  
            for (int i = 0; i < N; i++) {  
                for (int j = 0; j < M; j++) {  
                    if (tomatoes[k][i][j] == 0) {  
                        result = 0;  
                        break outer;  
                    } else {  
                        result = Math.max(result, tomatoes[k][i][j]);  
                    }  
                }  
            }  
        }  
  
        sb.append(result - 1);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void bfs(int M, int N, int H, int[][][] tomatoes) {  
        int[] dx = {-1, 1, 0, 0, 0, 0};  
        int[] dy = {0, 0, -1, 1, 0, 0};  
        int[] dz = {0, 0, 0, 0, 1, -1};  
  
        while (!deque.isEmpty()) {  
            int[] cur = deque.poll();  
            int cz = cur[0];  
            int cx = cur[1];  
            int cy = cur[2];  
  
            for (int i = 0; i < 6; i++) {  
                int nz = cz + dz[i];  
                int nx = cx + dx[i];  
                int ny = cy + dy[i];  
  
                if (nz >= 0 && nz < H &&  nx >= 0 && nx < N && ny >= 0 && ny < M) {  
                    if (tomatoes[nz][nx][ny] == 0) {  
                        tomatoes[nz][nx][ny] = tomatoes[cz][cx][cy] + 1;  
                        deque.offer(new int[]{nz, nx, ny});  
                    }  
                }  
            }  
        }  
    }  
}