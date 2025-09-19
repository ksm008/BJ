import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long N = Long.parseLong(br.readLine());

        if (N >= Short.MIN_VALUE && N <= Short.MAX_VALUE) sb.append("short");
        else if (N >= Integer.MIN_VALUE && N <= Integer.MAX_VALUE) sb.append("int");
        else sb.append("long long");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
