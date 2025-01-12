import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(br.readLine());
            int result = 0;
            if (num == 0) {
                break;
            }

            for (int i = 0; i < num; i++) {
                result += i + 1;
            }

            bw.write(result + "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
