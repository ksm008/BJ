import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int cake = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[2]);

        if (cake - x > x) {
            x = cake - x;
        }

        if (cake - y > y) {
            y = cake - y;
        }

        bw.write(x * y * 4 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}