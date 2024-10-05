import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int dayCount = 1;

        if (A >= V) {
            bw.write(Integer.toString(dayCount));
        } else {
            dayCount += ((V - A) / (A - B));
            if ((V - B) % (A - B) != 0) {
                dayCount++;
            }
            bw.write(Integer.toString(dayCount));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}