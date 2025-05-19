import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 간단한 계산 문제...

        int num = Integer.parseInt(br.readLine());
        int result = Integer.parseInt(br.readLine());

        for (int i = 1; i < num; i++) {
            result += Integer.parseInt(br.readLine());
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}