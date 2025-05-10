import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 다 더하고 마지막에 5 곱하기

        String[] str = br.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result += Integer.parseInt(str[i]);
        }
        bw.write(result * 5 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
