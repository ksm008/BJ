import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        long result = 1;
        for (long i = 1; i <= num; i++) {
            result *= i;
        }
        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}