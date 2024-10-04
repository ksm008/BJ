import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        if (str.length() > 1000000) {
            System.exit(0);
        }

        StringTokenizer st = new StringTokenizer(str, " ");

        bw.write(Integer.toString(st.countTokens()));

        bw.flush();
        bw.close();
        br.close();
    }
}