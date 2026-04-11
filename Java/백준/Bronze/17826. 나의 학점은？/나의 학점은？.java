import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 50; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int hongik = Integer.parseInt(br.readLine());
        int idx = list.indexOf(hongik) + 1;

        String grade = "";

        if (idx >= 1 && idx <= 5) {
            grade = "A+";
        } else if (idx >= 6 && idx <= 15) {
            grade = "A0";
        } else if (idx >= 16 && idx <= 30) {
            grade = "B+";
        } else if (idx >= 31 && idx <= 35) {
            grade = "B0";
        } else if (idx >= 36 && idx <= 45) {
            grade = "C+";
        } else if (idx >= 46 && idx <= 48) {
            grade = "C0";
        } else {
            grade = "F";
        }

        sb.append(grade);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}