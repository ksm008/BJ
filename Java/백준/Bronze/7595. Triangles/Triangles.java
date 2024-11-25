import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i+1; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}