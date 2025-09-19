import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static char[][] colorPanel;
    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        colorPanel = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                colorPanel[i][j] = str.charAt(j);
            }
        }

        int normalCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, colorPanel[i][j]);
                    normalCnt++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (colorPanel[i][j] == 'R') colorPanel[i][j] = 'G';
            }
        }

        int colorBlindCnt = 0;
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, colorPanel[i][j]);
                    colorBlindCnt++;
                }
            }
        }

        sb.append(normalCnt).append(" ").append(colorBlindCnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isIn(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }

    static void dfs(int x, int y, char color) {
        visited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (!isIn(nx, ny)) continue;
            if (visited[nx][ny]) continue;
            if (colorPanel[nx][ny] != color) continue;

            dfs(nx, ny, color);
        }
    }
}
