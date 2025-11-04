import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int patternCnt = 0;
        int totalCnt = 0;

        // 시간을 최소화 하려면 단 한번만 문자열을 훑어야 한다.
        for (int i = 0; i < S - 2; i++) {
            if (str.charAt(i) == 'I' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {
                patternCnt++;
                i++;
                if (patternCnt >= N) {
                    totalCnt++;
                }
            } else {
                patternCnt = 0;
            }
        }

        sb.append(totalCnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
