import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String str = "WelcomeToSMUPC";
        int curIdx;
        if (num < 15) {
            bw.write(str.charAt(num - 1));
        } else {
            curIdx = num % 14;
            if (curIdx == 0) {
                bw.write(str.charAt(13));
            } else {
                bw.write(str.charAt(curIdx - 1));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}