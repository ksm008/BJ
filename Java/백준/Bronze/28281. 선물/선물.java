import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long previous = Long.parseLong(st.nextToken());
        long min = Long.MAX_VALUE;

        for (int i = 1; i < N; i++) {
            long curr = Long.parseLong(st.nextToken());
            min = Math.min(min, (previous + curr) * X);
            previous = curr;

        }

        sb.append(min);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}