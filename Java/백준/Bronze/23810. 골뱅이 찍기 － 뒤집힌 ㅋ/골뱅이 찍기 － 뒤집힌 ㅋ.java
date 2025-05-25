import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 그냥 전부 for문 씀

        int num = Integer.parseInt(br.readLine());
        int size = 5 * num;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < size; j++) {
                bw.write("@");
            }
            bw.newLine();
        }
        for (int i = 0;i < num; i++) {
            for (int j = 0; j < num; j++) {
                bw.write("@");
            }
            bw.newLine();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < size; j++) {
                bw.write("@");
            }
            bw.newLine();
        }
        for (int i = 0;i < num; i++) {
            for (int j = 0; j < num; j++) {
                bw.write("@");
            }
            bw.newLine();
        }
        for (int i = 0;i < num; i++) {
            for (int j = 0; j < num; j++) {
                bw.write("@");
            }
            if (i != num - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}