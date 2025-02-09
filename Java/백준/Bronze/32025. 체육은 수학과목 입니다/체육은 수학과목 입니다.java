import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        float A = Integer.parseInt(br.readLine());
        float B = Integer.parseInt(br.readLine());
        float result = 0;

        if (A > B) {
            result = B / 2 * 100;
        } else {
            result = A / 2 * 100;
        }

        int print = (int) result;

        bw.write(print + "");
        bw.flush();
        bw.close();
        br.close();
    }
}