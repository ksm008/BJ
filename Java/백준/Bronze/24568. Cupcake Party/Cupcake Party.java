import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int big = Integer.parseInt(br.readLine());
        int small = Integer.parseInt(br.readLine());
        int total= big * 8 + small * 3;
        bw.write(Integer.toString(total - 28));

        bw.flush();
        bw.close();
        br.close();
    }
}