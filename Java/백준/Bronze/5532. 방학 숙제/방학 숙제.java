import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int vacation = Integer.parseInt(br.readLine());
        int langTotal = Integer.parseInt(br.readLine());
        int mathTotal = Integer.parseInt(br.readLine());
        int langMax = Integer.parseInt(br.readLine());
        int mathMax = Integer.parseInt(br.readLine());

        int langStudy = langTotal / langMax;
        if (langTotal % langMax != 0) {
            langStudy += 1;
        }

        int mathStudy = mathTotal / mathMax;
        if (mathTotal % mathMax != 0) {
            mathStudy += 1;
        }

        int totalStudy = Math.max(mathStudy, langStudy);

        bw.write(Integer.toString(vacation - totalStudy));

        bw.flush();
        bw.close();
        br.close();
    }
}