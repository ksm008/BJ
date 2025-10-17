import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long x1 = Long.parseLong(st.nextToken());
            long y1 = Long.parseLong(st.nextToken());
            long r1 = Long.parseLong(st.nextToken());
            long x2 = Long.parseLong(st.nextToken());
            long y2 = Long.parseLong(st.nextToken());
            long r2 = Long.parseLong(st.nextToken());

            long dx = x2 - x1;
            long dy = y2 - y1;
            long d2 = dx * dx + dy * dy;
            long sum = r1 + r2;
            long diff = Math.abs(r1 - r2);
            long sum2 = sum * sum;
            long diff2 = diff * diff;

            if (d2 == 0 && r1 == r2) {
                sb.append("-1\n");
            } else if (diff2 < d2 && d2 < sum2) {
                sb.append("2\n");
            } else if (d2 == sum2 || d2 == diff2) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
