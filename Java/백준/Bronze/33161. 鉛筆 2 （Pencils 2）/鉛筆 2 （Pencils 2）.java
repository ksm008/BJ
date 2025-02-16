import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int yen = Integer.parseInt(br.readLine());

        bw.write(yen / 5 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}