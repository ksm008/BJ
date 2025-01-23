import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String str = br.readLine();

            if (i % 2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    if (str.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            } else {
                for (int j = 1; j < 8; j += 2) {
                    if (str.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}