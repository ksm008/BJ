import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int hour = Integer.parseInt(str[0]);
        int minute = Integer.parseInt(str[1]);

        bw.write((hour - 9) * 60 + minute + "");

        bw.flush();
        bw.close();
        br.close();
    }
}