import java.io.*;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("MMMM")
                .toFormatter(Locale.ENGLISH);
        Month monthName = Month.from(formatter.parse(st.nextToken()));
        int month = monthName.getValue();
        int day = Integer.parseInt(st.nextToken().replaceAll(",", ""));
        int year = Integer.parseInt(st.nextToken());
        String timeTable = st.nextToken();
        int hour = Integer.parseInt(timeTable.substring(0,2));
        int minute = Integer.parseInt(timeTable.substring(3));
        int yearToMinute = 525600;

        int[] monthTable = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            yearToMinute = 527040;
            monthTable[1] = 29;
        }

        int totalMinute = minute + hour * 60 + ((day - 1) * 24 * 60);

        for (int i = 1; i < month; i++) {
            totalMinute += monthTable[i - 1] * 24 * 60;
        }

        double result = ((double) totalMinute / yearToMinute) * 100;

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
