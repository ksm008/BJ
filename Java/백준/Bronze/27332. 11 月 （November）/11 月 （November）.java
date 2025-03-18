import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int day = Integer.parseInt(br.readLine());
        int after = Integer.parseInt(br.readLine());

        int result = day + after * 7;

        if (result > 30) {
            bw.write("0");
        } else {
            bw.write("1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}