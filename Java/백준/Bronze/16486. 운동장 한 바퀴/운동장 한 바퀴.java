import java.io.*;

public class Main {
    static final double PI = 3.141592;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        double result = 2 * PI * d2 + 2 * d1;

        sb.append(String.format("%.6f", result));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
