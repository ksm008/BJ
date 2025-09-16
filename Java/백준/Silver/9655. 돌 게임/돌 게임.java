import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        sb.append(N % 2 == 0 ? "CY" : "SK");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
