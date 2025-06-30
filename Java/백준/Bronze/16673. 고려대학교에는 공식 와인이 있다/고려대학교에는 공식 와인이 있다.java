import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int C = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int P = Integer.parseInt(str[2]);

        long result = 0;
        for (int n = 1; n <= C; n++) {
            result += (long)K * n + (long)P * n * n;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}