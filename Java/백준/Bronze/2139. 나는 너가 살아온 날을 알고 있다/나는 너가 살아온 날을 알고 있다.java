import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        StringTokenizer st;
        int day;
        int month;
        int year;

        while(true) {
            st = new StringTokenizer(br.readLine());
            day = Integer.parseInt(st.nextToken());
            month = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());
            int result = 0;

            if (day == 0 && month == 0 && year == 0) {
                break;
            }

            for (int i = 0; i < month; i++) {
                result += days[i];
            }
            result += day;

            if (month >= 3) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    result += 1;
                }
            }
            sb.append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}