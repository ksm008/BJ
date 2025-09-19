import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lanCable = new int[K];
        long result = 0;

        for (int i = 0; i < K; i++) {
            lanCable[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lanCable);

        long min = 1;
        long max = lanCable[K - 1];

        while (min <= max) {
            long mid = (min + max) / 2;
            long count = 0;

            for (int i = 0; i < K; i++) {
                count += lanCable[i] / mid;
            }
            if (count >= N) {
                result = mid;
                min = mid + 1;
            } else if (count < N) {
                max = mid - 1;
            }
        }

        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
