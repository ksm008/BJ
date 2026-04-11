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

        int[] bus = new int[M];

        int[][] busAll = new int[N + 1][N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            bus[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                busAll[i + 1][j + 1] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        for (int i = 0; i < M - 1; i++) {
            int start = bus[i];
            int end = bus[i + 1];
            result += busAll[start][end];
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}