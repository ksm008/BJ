import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int w = Integer.parseInt(str[2]);
        int h = Integer.parseInt(str[3]);

        int distance = Math.min(w - x, h - y);
        int outlineDistance = Math.min(x, y);

        int result = Math.min(distance, outlineDistance);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}