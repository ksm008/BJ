import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int N, M, maxSum;
    static boolean[][] visited;
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];

        paper = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, paper[i][j]);
                visited[i][j] = false;
                checkT(i, j);
            }
        }

        sb.append(maxSum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    // T를 제외한 나머지 테트로미노는 깊이가 4인 DFS로 전부 구해진다.
    static void dfs(int c, int r, int depth, int sum) {
        if (depth == 4) {
            maxSum = Math.max(maxSum, sum);
            return;
        }
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int n = c + dy[i];
            int m = r + dx[i];

            if (n >= 0 && n < N && m >= 0 && m < M && !visited[n][m]) {
                visited[n][m] = true;
                dfs(n, m, depth + 1, sum + paper[n][m]);
                visited[n][m] = false;
            }
        }
    }

    static void checkT(int c, int r) {
        int sum;
        // 아래를 향하는 T
        if (r - 1 >= 0 && r + 1 < M && c + 1 < N) {
            sum = paper[c][r] + paper[c][r - 1] + paper[c][r + 1] + paper[c + 1][r];
            maxSum = Math.max(maxSum, sum);
        }
        // 위를 향하는 T
        if (r + 1 < M && c - 1 >= 0 && r - 1 >= 0) {
            sum = paper[c][r] + paper[c][r + 1] + paper[c][r - 1] + paper[c - 1][r];
            maxSum = Math.max(maxSum, sum);
        }
        // 오른쪽 T
        if (r + 1 < M && c + 1 < N && c - 1 >= 0) {
            sum = paper[c][r] + paper[c + 1][r] + paper[c - 1][r] + paper[c][r + 1];
            maxSum = Math.max(maxSum, sum);
        }
        // 왼쪽 T
        if (c + 1 < N && c - 1 >= 0 && r - 1 >= 0) {
            sum = paper[c][r] + paper[c + 1][r] + paper[c - 1][r] + paper[c][r - 1];
            maxSum = Math.max(maxSum, sum);
        }
    }
}