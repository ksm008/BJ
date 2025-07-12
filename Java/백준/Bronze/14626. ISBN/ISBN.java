import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int sum = 0, idx = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '*') {
                idx = i;
            } else if (i < 12) {
                int num = ch - '0';
                sum += (i % 2 == 0) ? num : num * 3;
            }
        }

        int checkDigit = str.charAt(12) - '0';
        int weight = (idx % 2 == 0) ? 1 : 3;

        for (int i = 0; i <= 9; i++) {
            int total = sum + i * weight + checkDigit;
            if (total % 10 == 0) {
                bw.write(i + "");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}