import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 큰 2차원 배열 하나 만들어서 그 안에 영역별로 true값을 입력하고 true로 선택된 놈들만 더해서 면적을 구함.

        boolean[][] board = new boolean[101][101];
        int result = 0;

        for (int k = 0; k < 4; k++) {
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);

            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    board[i][j] = true;
                }
            }
        }

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (board[i][j]) result++;
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}