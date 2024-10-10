import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = {1,1,2,2,2,8};
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < 6; i++) {
            int inputChess = Integer.parseInt(str[i]);
            int result = chess[i] - inputChess;
            bw.write(result + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}