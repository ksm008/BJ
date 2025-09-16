import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt(br.readLine());
        int K = 0;
        int sum = 0;

        while (sum < X) {
            K++;
            sum += K;
        }

        int offset = X - (sum - K);

        int num, num2;
        if (K % 2 == 0) {
            num = offset;
            num2 = K - offset + 1;
        } else {
            num = K - offset + 1;
            num2 = offset;
        }

        sb.append(num).append("/").append(num2);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
