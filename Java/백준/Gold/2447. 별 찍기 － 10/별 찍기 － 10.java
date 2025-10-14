import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                toPutStarOrNot(i, j, N);
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void toPutStarOrNot(int i, int j, int n) {
        if (n == 1) {
            sb.append("*");
            return;
        }

        if ((n / 3 <= i && i < 2 * n / 3) && (n / 3 <= j && j < 2 * n / 3)) sb.append(" ");
        else {
            toPutStarOrNot(i % (n / 3), j % (n / 3), n / 3);
        }
    }
}

