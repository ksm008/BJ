import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] A = new int[10];
        int[] B = new int[10];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 10; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 10; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int aScore = 0;
        int bScore = 0;
        int lastWinner = 2;

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                aScore += 3;
                lastWinner = 0;
            } else if (A[i] < B[i]) {
                bScore += 3;
                lastWinner = 1;
            } else {
                aScore++;
                bScore++;
            }
        }

        sb.append(aScore).append(" ").append(bScore).append("\n");

        if (aScore > bScore) {
            sb.append("A");
        } else if (aScore < bScore) {
            sb.append("B");
        } else {
            if (lastWinner == 0) {
                sb.append("A");
            } else if (lastWinner == 1) {
                sb.append("B");
            } else {
                sb.append("D");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}