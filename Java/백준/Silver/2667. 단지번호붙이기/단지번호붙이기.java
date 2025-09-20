import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int N;  
    static int[][] map;  
    static boolean[][] visited;  
    static int[] dx = {-1, 1, 0, 0};  
    static int[] dy = {0, 0, -1, 1};  
  
    public static void main(String[] args) throws IOException {  
        N = Integer.parseInt(br.readLine());  
        map = new int[N][N];  
        visited = new boolean[N][N];  
  
        for (int i = 0; i < N; i++) {  
            String s = br.readLine();  
            for (int j = 0; j < N; j++) map[i][j] = s.charAt(j) - '0';  
        }  
  
        int complexCnt = 0;  
        List<Integer> sizes = new ArrayList<>();  
  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < N; j++) {  
                if (map[i][j] == 1 && !visited[i][j]) {  
                    int size = dfs(i, j);   
                    sizes.add(size);  
                    complexCnt++;  
                }  
            }  
        }  
  
        Collections.sort(sizes);  
        sb.append(complexCnt).append("\n");  
        for (int v : sizes) sb.append(v).append("\n");  
  
        bw.write(sb.toString());  
        bw.flush();  
    }  
  
    static int dfs(int x, int y) {  
        if (x < 0 || y < 0 || x >= N || y >= N) return 0;  
        if (map[x][y] == 0 || visited[x][y]) return 0;  
  
        visited[x][y] = true;  
        int size = 1;  
        for (int dir = 0; dir < 4; dir++) {  
            size += dfs(x + dx[dir], y + dy[dir]);  
        }  
        return size;  
    }  
}