import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int first = 0, second = 0;

        for (int i = 1; i <= num; i++) {
            first += i;
            second += (int)Math.pow(i, 3);
        }

        bw.write(first + "\n");
        bw.write((int)Math.pow(first, 2) + "\n");
        bw.write(second + "");

        bw.flush();
        bw.close();
        br.close();
    }
}