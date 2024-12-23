import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            String str = br.readLine();

            if (str.equals("# 0 0")) {
                break;
            }

            String[] member = str.split(" ");

            if (Integer.parseInt(member[1]) > 17 || Integer.parseInt(member[2]) >= 80) {
                bw.write(member[0] + " Senior" );
            } else {
                bw.write(member[0] + " Junior");
            }

            bw.newLine();

        }
        bw.flush();
        bw.close();
        br.close();
    }
}