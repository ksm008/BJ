import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String str;
        int result = 1;
        int[][] square = new int[N][M];

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            for (int j = 0; j < M; j++) {
                square[i][j] = str.charAt(j) - '0';
            }
        }

        int min = Math.min(N, M);
        for (int dist = 1; dist < min; dist++) {
            for (int i = 0; i + dist < N; i++) {
                for (int j = 0; j + dist < M; j++) {
                    int temp = square[i][j];
                    if (temp == square[i][j + dist] && temp == square[i + dist][j] && temp == square[i + dist][j + dist]) {
                        result = Math.max(result, (dist + 1) * (dist + 1));
                    }
                }
            }
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}