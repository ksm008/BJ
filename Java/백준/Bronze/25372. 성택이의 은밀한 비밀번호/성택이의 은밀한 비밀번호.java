import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            if (str.length() >= 6 && str.length() <= 9) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}