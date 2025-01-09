import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] paper = new int[100][100];
        int num = Integer.parseInt(br.readLine());
        int overrided = 0;

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    if (paper[j][k] == 1) {
                        overrided++;
                    } else {
                        paper[j][k] = 1;
                    }
                }
            }
        }

        bw.write(num * 100 - overrided + "");

        bw.flush();
        bw.close();
        br.close();
    }
}