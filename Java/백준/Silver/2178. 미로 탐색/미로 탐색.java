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

        int[][] maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        sb.append(bfs(maze, 0, 0, N, M));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int[][] maze, int x, int y, int N, int M) {
        Deque<List<Integer>> queue = new ArrayDeque<>();
        queue.offer(new ArrayList<>(Arrays.asList(x, y)));

        while (!queue.isEmpty()) {
            List<Integer> list = queue.poll();
            x = list.get(0);
            y = list.get(1);

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (maze[nx][ny] == 0) continue;
                if (maze[nx][ny] == 1) {
                    maze[nx][ny] = maze[x][y] + 1;
                    queue.offer(new ArrayList<>(Arrays.asList(nx, ny)));
                }
            }
        }
        return maze[N - 1][M - 1];

    }

}