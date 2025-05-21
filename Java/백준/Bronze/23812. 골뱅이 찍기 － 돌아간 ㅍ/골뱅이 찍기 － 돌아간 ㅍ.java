import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < 5; i++) {
            int type = (i % 2 == 0) ? 1 : 2;

            for (int row = 0; row < num; row++) {
                for (int col = 0; col < 5; col++) {
                    for (int k = 0; k < num; k++) {
                        if (type == 1) {
                            if (col == 0 || col == 4) bw.write("@");
                            else bw.write(" ");
                        } else {
                            bw.write("@");
                        }
                    }
                }
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
