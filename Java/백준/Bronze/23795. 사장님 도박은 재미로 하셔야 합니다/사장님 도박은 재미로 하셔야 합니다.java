import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 0;

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            }

            total += num;
        }

        bw.write(total + "");

        bw.flush();
        bw.close();
        br.close();
    }
}