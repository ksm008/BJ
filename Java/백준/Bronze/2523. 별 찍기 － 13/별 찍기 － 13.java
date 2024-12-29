import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num - 1; i++) {
            for (int k = 0; k < i + 1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        for (int i = 0; i < num; i++) {
            bw.write("*");
        }
        bw.newLine();
        for (int i = 0; i < num - 1; i++) {
            for (int k = num - i - 1; k > 0; k--) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
