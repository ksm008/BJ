import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char ch = br.readLine().charAt(0);
        String password = "ILOVEYONSEI";

        int current = ch - 'A';
        int result = 0;

        for (char ch1 : password.toCharArray()) {
            int target = ch1 - 'A';
            result += Math.abs(current - target);
            current = target;
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}