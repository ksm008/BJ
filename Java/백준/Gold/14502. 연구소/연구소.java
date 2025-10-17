import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int N, M;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] lab = new int[N][M];
        List<int[]> emptySpace = new ArrayList<>();
        List<int[]> virus = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(st.nextToken());
                if (lab[i][j] == 0) emptySpace.add(new int[]{i, j});
                else if (lab[i][j] == 2) virus.add(new int[]{i, j});
            }
        }

        int result = solve(lab, emptySpace, virus);
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int solve(int[][] lab, List<int[]> emptySpace, List<int[]> virus) {
        int emptySpaceSize = emptySpace.size();
        int result = 0;

        for (int i = 0; i < emptySpaceSize - 2; i++) {
            for (int j = i + 1; j < emptySpaceSize - 1; j++) {
                for (int k = j + 1; k < emptySpaceSize; k++) {

                    int[][] copiedLab = new int[N][M];
                    for (int l = 0; l < N; l++) {
                        System.arraycopy(lab[l], 0, copiedLab[l], 0, M);
                    }

                    int wall1X = emptySpace.get(i)[0];
                    int wall1Y = emptySpace.get(i)[1];

                    int wall2X = emptySpace.get(j)[0];
                    int wall2Y = emptySpace.get(j)[1];

                    int wall3X = emptySpace.get(k)[0];
                    int wall3Y = emptySpace.get(k)[1];

                    copiedLab[wall1X][wall1Y] = 1;
                    copiedLab[wall2X][wall2Y] = 1;
                    copiedLab[wall3X][wall3Y] = 1;

                    result = Math.max(result, spreadVirus(copiedLab, virus, emptySpaceSize - 3));
                }
            }
        }

        return result;
    }

    static int spreadVirus(int[][] copiedLab, List<int[]> virus, int emptySpaceSize) {
        Deque<int[]> queue = new ArrayDeque<>(virus);

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (copiedLab[nx][ny] == 0) {
                        copiedLab[nx][ny] = 2;
                        queue.offer(new int[]{nx, ny});
                        emptySpaceSize--;
                    }
                }
            }
        }

        return emptySpaceSize;
    }
}

