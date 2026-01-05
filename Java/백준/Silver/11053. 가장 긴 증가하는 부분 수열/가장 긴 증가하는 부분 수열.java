import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int[] dp = new int[N];

        Arrays.fill(dp, 1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        
        for (int i = 1; i < N; i++) {
            int curr = array[i];
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] < curr) {
                    if (dp[j] > max) {
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
        }

        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > result) {
                result = dp[i];
            }
        }
        
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}