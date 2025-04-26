import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        int[][] matrix1 = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                matrix1[i][j] = Integer.parseInt(str[j]);
            }
        }

        String[] str2 = br.readLine().split(" ");
        int M2 = Integer.parseInt(str2[0]);
        int K = Integer.parseInt(str2[1]);
        int[][] matrix2 = new int[M2][K];

        for (int i = 0; i < M2; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < K; j++) {
                matrix2[i][j] = Integer.parseInt(str[j]);
            }
        }

        int[][] result = new int[N][K];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < M; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                bw.write(result[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
