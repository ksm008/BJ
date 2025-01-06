import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");

            int result = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);

            bw.write("Case " + (i + 1) + ": " + result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}