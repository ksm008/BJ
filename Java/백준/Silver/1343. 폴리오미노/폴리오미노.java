import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        String A = "AAAA";
        String B = "BB";

        str = str.replaceAll("XXXX", A);
        str = str.replaceAll("XX", B);
        if (!str.contains("X")) {
            sb.append(str);
        } else {
            sb.append("-1");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
