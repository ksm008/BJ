import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}