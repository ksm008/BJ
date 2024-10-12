import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = br.readLine().split(" ");
        int row = Integer.parseInt(str1[0]);
        int col = Integer.parseInt(str1[1]);
        Integer[][] matrix1 = new Integer[row][col];
        Integer[][] matrix2 = new Integer[row][col];

        for (int i = 0; i < row; i++) {
            String[] str2 = br.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = Integer.parseInt(str2[j]);
            }
        }
        for (int i = 0; i < row; i++) {
            String[] str3 = br.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = Integer.parseInt(str3[j]);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                bw.write(matrix1[i][j] + matrix2[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}