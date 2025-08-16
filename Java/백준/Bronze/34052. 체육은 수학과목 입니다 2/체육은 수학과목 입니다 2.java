import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        for (int i = 0; i < 4; i++) {
            result += Integer.parseInt(br.readLine());
        }

        if (result > 1500) {
            bw.write("No");
        } else {
            bw.write("Yes");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}