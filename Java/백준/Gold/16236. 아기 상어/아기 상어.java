import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int N;  
  
    public static void main(String[] args) throws IOException {  
        N = Integer.parseInt(br.readLine());  
        int[][] sharkPlayground = new int[N][N];  
  
        int sharkCol = 0;  
        int sharkRow = 0;  
  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < N; j++) {  
                sharkPlayground[i][j] = Integer.parseInt(st.nextToken());  
                if (sharkPlayground[i][j] == 9) {  
                    sharkCol = i;  
                    sharkRow = j;  
                }  
            }  
        }  
          
        int totalTime = 0;  
        int eatCount = 0;  
        int babySharkSize = 2;  
        int[] result;  
          
        while (true) {  
            result = bfs(sharkPlayground, sharkCol, sharkRow, babySharkSize);  
            if (result != null) {  
                sharkPlayground[sharkCol][sharkRow] = 0;  
                sharkCol = result[0];  
                sharkRow = result[1];  
                totalTime += result[2];  
  
                eatCount++;  
  
                if (eatCount == babySharkSize) {  
                    babySharkSize++;  
                    eatCount = 0;  
                }  
            } else {  
                break;  
            }  
  
        }  
  
        sb.append(totalTime);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int[] bfs(int[][] sharkPlayground, int sharkCol, int sharkRow, int babySharkSize) {  
        int time = 0;  
  
        int[] dy = {-1, 1, 0, 0};  
        int[] dx = {0, 0, -1, 1};  
        boolean[][] visited = new boolean[N][N];  
  
        Deque<int[]> queue = new ArrayDeque<>();  
        List<int[]> candidates = new ArrayList<>();  
  
        visited[sharkCol][sharkRow] = true;  
        queue.offer(new int[]{sharkCol, sharkRow});  
  
        while (!queue.isEmpty()) {  
            int size = queue.size();  
  
            for (int i = 0; i < size; i++) {  
                int[] cur = queue.poll();  
                int col = cur[0];  
                int row = cur[1];  
  
                for (int j = 0; j < 4; j++) {  
                    int dCol = col + dy[j];  
                    int dRow = row + dx[j];  
  
                    if (dCol >= 0 && dCol < N && dRow >= 0 && dRow < N  
                            && !visited[dCol][dRow]  
                            && sharkPlayground[dCol][dRow] <= babySharkSize) {  
                        visited[dCol][dRow] = true;  
                        queue.offer(new int[]{dCol, dRow});  
  
                        if (sharkPlayground[dCol][dRow] < babySharkSize && sharkPlayground[dCol][dRow] > 0) {  
                            candidates.add(new int[]{dCol, dRow});  
                        }  
                    }  
                }  
            }  
            time++;  
            if (!candidates.isEmpty()) {  
                candidates.sort(  
                        Comparator.comparingInt((int[] arr) -> arr[0])  
                                .thenComparingInt((int[] arr) -> arr[1])  
                );  
  
                int resultY = candidates.get(0)[0];  
                int resultX = candidates.get(0)[1];  
  
                candidates.clear();  
                return new int[]{resultY, resultX, time};  
            }  
        }  
  
        return null;  
    }  
}