import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 간단한 계산 문제...

        int num = Integer.parseInt(br.readLine());
        bw.write(num * (num - 1) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
