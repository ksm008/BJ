import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int A = num - ((num * 22) / 100);
        int B = num - ((num * 20) / 100) * 22 / 100;

        bw.write(A + " " + B);

        bw.flush();
        bw.close();
        br.close();
    }
}
