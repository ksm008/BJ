import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        String prevStr = null;

        for (int i = 0; i < 100; i++) {
            str = br.readLine();
            if (str == null) {
                break;
            }
            if (prevStr != null) {
                bw.write(prevStr + "\n");
            }
            prevStr = str;
        }

        if (prevStr != null) {
            bw.write(prevStr);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}