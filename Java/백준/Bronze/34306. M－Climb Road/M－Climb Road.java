import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int W = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        W = W * 5280;

        sb.append(W / N);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
