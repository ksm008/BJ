import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int jaemin = 0;
        int gotRobbed = 0;

        if (N >= 1000000) {
            gotRobbed = (int)(N * 0.2);

        } else if (N >= 500000) {
            gotRobbed = (int)(N * 0.15);
        } else if (N >= 100000) {
            gotRobbed = (int)(N * 0.1);
        } else {
            gotRobbed = (int)(N * 0.05);
        }

        jaemin = N - gotRobbed;

        sb.append(gotRobbed).append(" ").append(jaemin);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}