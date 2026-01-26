import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[2]);
        int C = Integer.parseInt(str[4]);

        if (A + B == C) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}