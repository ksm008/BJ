import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n1 = Integer.parseInt(str[0]);
        int k1 = Integer.parseInt(str[1]);
        int n2 = Integer.parseInt(str[2]);
        int k2 = Integer.parseInt(str[3]);

        bw.write(n1 * k1 + n2 * k2 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}