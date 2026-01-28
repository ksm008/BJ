import java.io.*;  
import java.util.ArrayDeque;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static int N, M;  
    static int[][] map;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        N = Integer.parseInt(st.nextToken());  
        M = Integer.parseInt(st.nextToken());  
        map = new int[N][M];  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            for (int j = 0; j < M; j++) {  
                map[i][j] = str.charAt(j) - '0';  
            }  
        }  
  
        int result = bfs();  
  
        sb.append(result);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int bfs() {  
        int[] dy = {-1, 0, 1, 0};  
        int[] dx = {0, -1, 0, 1};  
  
        boolean[][][] visited = new boolean[N][M][2];  
  
        Deque<int[]> q = new ArrayDeque<>();  
        q.offer(new int[]{0, 0, 1, 0});  
        visited[0][0][0] = true;  
  
        while (!q.isEmpty()) {  
            int[] cur = q.poll();  
            int cr = cur[0];  
            int cc = cur[1];  
            int cd = cur[2];  
            int cWall = cur[3];  
  
            if (cr == N - 1 && cc == M - 1) {  
                return cd;  
            }  
  
            for (int i = 0; i < 4; i++) {  
                int nr = cr + dy[i];  
                int nc = cc + dx[i];  
  
                if (nr >= 0 && nr < N && nc >= 0 && nc < M) {  
                    if (map[nr][nc] == 0) {  
                        if (!visited[nr][nc][cWall]) {  
                            visited[nr][nc][cWall] = true;  
                            q.offer(new int[]{nr, nc, cd + 1, cWall});  
                        }  
                    } else {  
                        if (cWall == 0 && !visited[nr][nc][1]) {  
                            visited[nr][nc][1] = true;  
                            q.offer(new int[]{nr, nc, cd + 1, 1});  
                        }  
                    }  
                }  
            }  
        }  
  
        return -1;  
    }  
}