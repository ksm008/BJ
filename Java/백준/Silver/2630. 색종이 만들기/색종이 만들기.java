import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static int whiteCnt = 0;
    static int blueCnt = 0;
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutPaper(0, 0, N);

        sb.append(whiteCnt).append("\n").append(blueCnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void cutPaper(int r, int c, int size) {
        if (isSingleColored(r, c, size)) {
            if (paper[r][c] == 0) whiteCnt++;
            else blueCnt++;
            return;
        }

        int half = size / 2;
        cutPaper(r, c, half);
        cutPaper(r, c + half, half);
        cutPaper(r + half, c, half);          
        cutPaper(r + half, c + half, half);
    }

    static boolean isSingleColored(int r, int c, int size) {
        int color = paper[r][c];
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }
}
