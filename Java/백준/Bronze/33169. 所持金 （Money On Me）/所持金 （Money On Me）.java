import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int oneK = Integer.parseInt(br.readLine());
        int tenK = Integer.parseInt(br.readLine());

        bw.write(oneK * 1000 + tenK * 10000 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}