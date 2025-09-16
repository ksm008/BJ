import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        String ucpc = "UCPC";
        int idx = 0;

        for (int i = 0; i < str.length() && idx < ucpc.length(); i++) {
            if (str.charAt(i) == ucpc.charAt(idx)) idx++;
        }

        sb.append(idx == ucpc.length() ? "I love UCPC" : "I hate UCPC");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
