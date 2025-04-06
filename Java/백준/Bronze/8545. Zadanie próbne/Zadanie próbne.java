import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 2; i >= 0; i--) {
            bw.write(str.toCharArray()[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}