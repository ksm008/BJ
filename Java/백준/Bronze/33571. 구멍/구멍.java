import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        int[] alphabetAscii = new int[123];

        // 골뱅이
        alphabetAscii[64] = 1;
        // 소문자
        alphabetAscii[65] = 1;
        alphabetAscii[66] = 2;
        alphabetAscii[68] = 1;
        alphabetAscii[79] = 1;
        alphabetAscii[80] = 1;
        alphabetAscii[81] = 1;
        alphabetAscii[82] = 1;
        // 대문자
        alphabetAscii[97] = 1;
        alphabetAscii[98] = 1;
        alphabetAscii[100] = 1;
        alphabetAscii[101] = 1;
        alphabetAscii[103] = 1;
        alphabetAscii[111] = 1;
        alphabetAscii[112] = 1;
        alphabetAscii[113] = 1;

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result += alphabetAscii[ch];
            }
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}