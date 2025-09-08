import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int W = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());
        sb.append(W * L);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
