import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int result = 1;
        st = new StringTokenizer(br.readLine());
        int prev = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int tower = Integer.parseInt(st.nextToken());
            if (tower >= prev) {
                result++;
            }
            prev = tower;
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}