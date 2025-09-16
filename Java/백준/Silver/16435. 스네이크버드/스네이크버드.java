import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] fruit = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            fruit[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(fruit);

        for (int i = 0; i < N; i++) {
            int current = fruit[i];
            if (current > L) break;
            L++;
        }

        sb.append(L);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
