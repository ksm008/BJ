import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        outer:
        for (int i = 0; i < 15; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 15; j++) {
                char ch = st.nextToken().charAt(0);

                if (ch == 'w') {
                    sb.append("chunbae");
                    break outer;
                } else if (ch == 'b') {
                    sb.append("nabi");
                    break outer;
                } else if (ch == 'g') {
                    sb.append("yeongcheol");
                    break outer;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}