import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        int num = Integer.parseInt(br.readLine());

        String binaryString = Integer.toBinaryString(num);

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}