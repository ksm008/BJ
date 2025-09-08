import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            StringTokenizer st = new StringTokenizer(str, " ");
            
            int N = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int result = S / (N + 1);
            sb.append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
