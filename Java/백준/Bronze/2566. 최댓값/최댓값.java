import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] board = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String[] str = br.readLine().split(" ");

            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(str[j]);
            }

        }

        int max = 0;
        int maxRow = 1;
        int maxCol = 1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > max) {
                    max = board[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        bw.write(max + "\n");
        bw.write(maxRow + " " + maxCol);

        bw.flush();
        bw.close();
        br.close();
    }
}