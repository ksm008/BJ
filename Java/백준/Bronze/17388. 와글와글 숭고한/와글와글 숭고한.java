import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        if (a + b + c >= 100) {
            bw.write("OK");
        } else {
            int result = Math.min(a, Math.min(b, c));
            if (result == a) {
                bw.write("Soongsil");
            } else if (result == b) {
                bw.write("Korea");
            } else {
                bw.write("Hanyang");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}