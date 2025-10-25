import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int[] dx = {-1, 1, 0, 0};  
    static int[] dy = {0, 0, -1, 1};  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        int[][] tomato = new int[M][N];  
  
        int unriped = 0;  
        List<int[]> ripedPoint =  new ArrayList<>();  
  
        for (int i = 0; i < M; i++) {  
            st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < N; j++) {  
                int num = Integer.parseInt(st.nextToken());  
                tomato[i][j] = num;  
                if (num == 0) unriped++;  
                else if (num == 1) {  
                    ripedPoint.add(new int[]{i, j});  
                }  
            }  
        }  
  
        sb.append(bfs(tomato, ripedPoint, N, M, unriped));  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int bfs(int[][] tomato, List<int[]> ripedPoint, int N, int M, int unriped) {  
        if (unriped == 0) return 0;  
  
        Deque<int[]> queue = new ArrayDeque<>(ripedPoint);  
        int day = -1;  
        while (!queue.isEmpty()) {  
            int queueSize = queue.size();  
            day++;  
            for (int i = 0; i < queueSize; i++) {  
                int[] cur = queue.poll();  
                int cx = cur[0];  
                int cy = cur[1];  
  
                for (int k = 0; k < 4; k++) {  
                    int nx = cx + dx[k];  
                    int ny = cy + dy[k];  
  
                    if (nx >= 0 && nx < M && ny >= 0 && ny < N) {  
                        if (tomato[nx][ny] == 0) {  
                            unriped--;  
                            tomato[nx][ny] = 1;  
                            queue.offer(new int[]{nx, ny});  
                        }  
                    }  
                }  
            }  
        }  
  
        if (unriped == 0) return day;  
        else return -1;  
    }  
}