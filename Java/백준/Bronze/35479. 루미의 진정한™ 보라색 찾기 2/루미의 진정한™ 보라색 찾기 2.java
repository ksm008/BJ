import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        double R = Double.parseDouble(st.nextToken()) / 255;
        double G = Double.parseDouble(st.nextToken()) / 255;
        double B = Double.parseDouble(st.nextToken()) / 255;

        double K = 1 - Math.max(B ,Math.max(R, G));

        double C = 0;
        double M = 0;
        double Y = 0;

        if (K == 1) {
            C = 0;
            M = 0;
            Y = 0;
        } else {
            C = (1 - R - K) / (1 - K);
            M = (1 - G - K) / (1 - K);
            Y = (1 - B - K) / (1 - K);
        }

        DecimalFormat df = new DecimalFormat("0.0###");
        sb.append(df.format(C) + " " + df.format(M) + " " + df.format(Y)  + " " + df.format(K));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}