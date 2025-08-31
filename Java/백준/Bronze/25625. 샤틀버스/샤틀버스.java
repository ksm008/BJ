import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);

        int ans = (y < x) ? (y + x) : (y - x);

        bw.write(ans + "");
        bw.flush();
        bw.close();
        br.close();

    }
}