import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] bigGuys = new int[num][2];

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            bigGuys[i][0] = Integer.parseInt(str[0]);
            bigGuys[i][1] = Integer.parseInt(str[1]);
        }

        for (int i = 0; i < num; i++) {
            int rank = 1;
            for (int j = 0; j < num; j++) {
                if (i == j) continue;
                else if (bigGuys[i][0] < bigGuys[j][0] && bigGuys[i][1] < bigGuys[j][1]) {
                    rank++;
                }
            }
            bw.write(rank + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}