import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long percentDiscount = (S * (M + 1) * (100 - N)) / 100;
        long onePlusOneDiscount = S * M;

        if (percentDiscount < onePlusOneDiscount) {
            sb.append(percentDiscount);
        } else {
            sb.append(onePlusOneDiscount);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}