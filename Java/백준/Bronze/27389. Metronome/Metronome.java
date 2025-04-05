import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        float num = Integer.parseInt(br.readLine());
        float result = num / 4;

        bw.write(String.format("%.2f", result));

        bw.flush();
        bw.close();
        br.close();
    }
}