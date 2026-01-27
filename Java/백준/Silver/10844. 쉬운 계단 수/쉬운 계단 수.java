import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        long[][] stairNumbers = new long[N + 1][10];

        for (int i = 1; i < 10; i++) {
            stairNumbers[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    stairNumbers[i][j] = stairNumbers[i - 1][1] % 1000000000;
                } else if (j == 9) {
                    stairNumbers[i][j] = stairNumbers[i - 1][8] % 1000000000;
                } else {
                    stairNumbers[i][j] = (stairNumbers[i - 1][j - 1] + stairNumbers[i - 1][j + 1]) % 1000000000;
                }
            }
        }

        long result = 0;

        for (int i = 0; i < 10; i++) {
            result =  (result + stairNumbers[N][i]) % 1000000000;
        }
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}