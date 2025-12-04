import java.io.*;  
import java.util.LinkedList;  
import java.util.Queue;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int max, N, M;  
    static char[][] island;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        N = Integer.parseInt(st.nextToken());  
        M = Integer.parseInt(st.nextToken());  
  
        island = new char[N][M];  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            for (int j = 0; j < M; j++) {  
                island[i][j] = str.charAt(j);  
            }  
        }  
  
        max = 0;  
  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < M; j++) {  
                if (island[i][j] == 'L') {  
                    ahoy(i, j);  
                }  
            }  
        }  
  
        sb.append(max);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void ahoy(int row, int col) {  
        int[] dy = {-1, 0, 1, 0};  
        int[] dx = {0, -1, 0, 1};  
  
        boolean[][] visited = new boolean[N][M];  
  
        Queue<int[]> q = new LinkedList<>();  
        q.offer(new int[]{row, col, 0});  
        visited[row][col] = true;  
  
        int distance = 0;  
  
        while (!q.isEmpty()) {  
            int[] cur = q.poll();  
            int cr = cur[0];  
            int cc = cur[1];  
            int cd = cur[2];  
  
            for (int i = 0; i < 4; i++) {  
                int nr = cr + dy[i];  
                int nc = cc + dx[i];  
  
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && island[nr][nc] == 'L' && !visited[nr][nc]) {  
                    visited[nr][nc] = true;  
                    distance = cd + 1;  
                    q.offer(new int[]{nr, nc, distance});  
  
                }  
            }  
        }  
        max = Math.max(max, distance);  
    }  
}