import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int K =  Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int time = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            char Z = st.nextToken().charAt(0);

            time += T;

            if (time >= 210) {
                break;
            }

            if (Z == 'T') {
                K++;
                if (K > 8) {
                    K %= 8;
                }
            }
        }

        sb.append(K);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}