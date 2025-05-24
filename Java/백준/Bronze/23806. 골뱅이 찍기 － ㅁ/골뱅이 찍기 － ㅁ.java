import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 총 크기는 5 * 입력...

        int num = Integer.parseInt(br.readLine());
        int size = 5 * num;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < num || i >= 4 * num) {
                    bw.write("@");
                } else {
                    if (j < num || j >= 4 * num) bw.write("@");
                    else bw.write(" ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}