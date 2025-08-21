import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            double earth = Double.parseDouble(br.readLine());
            if (earth < 0.0) {
                break;
            }

            double moon = earth * 0.167;

            bw.write("Objects weighing " + String.format("%.2f", earth) + " on Earth will weigh "  + String.format("%.2f", moon) + " on the moon.\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}