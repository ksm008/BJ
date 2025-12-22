import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
    );
    static BufferedWriter bw = new BufferedWriter(
        new OutputStreamWriter(System.out)
    );
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        sb.append(Math.min(Math.min((c / 2), y), p));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}