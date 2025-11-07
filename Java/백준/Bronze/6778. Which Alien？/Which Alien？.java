import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        if (antenna >= 3 && eyes <= 4) {
            sb.append("TroyMartian\n");
        }
        if (antenna <= 6 && eyes >= 2) {
            sb.append("VladSaturnian\n");
        }
        if (antenna <= 2 && eyes <= 3) {
            sb.append("GraemeMercurian\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
