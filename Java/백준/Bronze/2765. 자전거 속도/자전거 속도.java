import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static double PI = 3.1415927;

    public static void main(String[] args) throws IOException {
        int cnt = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());

            double diameter = Double.parseDouble(st.nextToken());
            double rotate = Double.parseDouble(st.nextToken());
            double time = Double.parseDouble(st.nextToken());

            if (rotate == 0) break;

            sb.append("Trip #").append(cnt).append(": ");

            double distance = (diameter * rotate * PI) / (5280 * 12);
            double MPH = distance / (time / 3600);

            sb.append(String.format("%.2f", distance)).append(" ").append(String.format("%.2f", MPH)).append("\n");
            cnt++;
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}