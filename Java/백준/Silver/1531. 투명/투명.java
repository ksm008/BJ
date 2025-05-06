import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] picture = new int[101][101];

        String[] str1 = br.readLine().split(" ");
        int repeatNum = Integer.parseInt(str1[0]);
        int requiredNum = Integer.parseInt(str1[1]);

        for (int i = 0; i < repeatNum; i++) {
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);

            for (int x = x1; x <= x2; x++) {
                for (int y = y1; y <= y2; y++) {
                    picture[x][y]++;
                }
            }
        }

        int invisible = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (picture[i][j] > requiredNum) {
                    invisible++;
                }
            }
        }

        bw.write(invisible + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
