import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N =  Integer.parseInt(br.readLine());
        String K = br.readLine();

        int evenCnt = 0;
        int oddCnt = 0;

        for (int i = 0; i < N; i++) {
            int num = K.charAt(i) - '0';

            if (num % 2 == 0) {
                evenCnt++;
            } else  {
                oddCnt++;
            }
        }

        if (evenCnt > oddCnt) {
            sb.append(0);
        } else if (evenCnt < oddCnt) {
            sb.append(1);
        } else {
            sb.append(-1);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}