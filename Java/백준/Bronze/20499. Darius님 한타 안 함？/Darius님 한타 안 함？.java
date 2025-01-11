import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("/");

        int k = Integer.parseInt(str[0]);
        int d = Integer.parseInt(str[1]);
        int a = Integer.parseInt(str[2]);

        if (k + a < d || d == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}