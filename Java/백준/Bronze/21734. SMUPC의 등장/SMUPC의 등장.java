import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        for (char ch : str.toCharArray()) {
            int ascii = ch;
            int sum = 0;

            for (char digit : String.valueOf(ascii).toCharArray()) {
                sum += digit - '0';
            }

            for (int i = 0; i < sum; i++) {
                bw.write(ch + "");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}