import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        long idx = num % 3;

        if (idx == 1) {
            bw.write("U");
        } else if (idx == 2) {
            bw.write("O");
        } else {
            bw.write("S");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}