import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);

            result = Math.max(result, w * h);

        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}