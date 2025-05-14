import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 아스키 값을 사용하여 계산

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;

        for (char c : str.toCharArray()) {
            result += (int) c - 64;
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}