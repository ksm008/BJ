import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        if (M == 2) {
            if (D == 18) {
                sb.append("Special");
            } else if (D > 18) {
                sb.append("After");
            } else {
                sb.append("Before");
            }
        } else if (M > 2) {
            sb.append("After");
        } else {
            sb.append("Before");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}