import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        sb.append(divideNConquer(r, c, N));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int divideNConquer(int r, int c, int N) {
        int offset;
        if (N == 0) return 0;
        int half = (int)Math.pow(2, N - 1);
        if (r < half && c < half) {
            return divideNConquer(r, c, N - 1);
        } else if (r < half && c >= half) {
            offset = half * half;
            return offset + divideNConquer(r, c - half, N - 1);
        } else if (r >= half && c < half) {
            offset = half * half * 2;
            return offset + divideNConquer(r - half, c, N - 1);
        } else {
            offset = half * half * 3;
            return offset + divideNConquer(r - half, c - half, N - 1);
        }
    }
}
