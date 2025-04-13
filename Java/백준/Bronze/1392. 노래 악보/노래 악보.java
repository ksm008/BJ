import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int sheets = Integer.parseInt(str[0]);
        int questions = Integer.parseInt(str[1]);
        int[] sheetTimes = new int[sheets];

        for (int i = 0; i < sheets; i++) {
            sheetTimes[i] = Integer.parseInt(br.readLine());
        }

        int[] endTimes = new int[sheets];

        endTimes[0] = sheetTimes[0];

        for (int i = 1; i < sheets; i++) {
            endTimes[i] = endTimes[i - 1] + sheetTimes[i];
        }

        for (int i = 0; i < questions; i++) {
            int time = Integer.parseInt(br.readLine());

            for (int j = 0; j < sheets; j++) {

                int start;

                if (j == 0) {
                    start = 0;
                } else {
                    start = endTimes[j - 1];
                }

                int end = endTimes[j] - 1;

                if (time >= start && time <= end) {
                    bw.write((j + 1) + "\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}