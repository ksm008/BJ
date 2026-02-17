import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());
        int total = S + 2 * M + 3 * L;

        if (total >= 10) sb.append("happy");
        else sb.append("sad");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}