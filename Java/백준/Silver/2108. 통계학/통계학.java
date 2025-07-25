import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];
        long sum = 0;

        for (int i = 0; i < num; i++) {
            list[i] = Integer.parseInt(br.readLine());
            sum += list[i];
        }

        Arrays.sort(list);

        int avg = (int) Math.round((double) sum / num);

        int mid = list[num / 2];

        int mode = list[0];
        int maxCount = 1, curCount = 1;
        boolean secondModeTaken = false;
        for (int i = 1; i < num; i++) {
            if (list[i] == list[i - 1]) {
                curCount++;
            } else {
                curCount = 1;
            }
            if (curCount > maxCount) {
                maxCount = curCount;
                mode = list[i];
                secondModeTaken = false;
            } else if (curCount == maxCount && !secondModeTaken) {
                mode = list[i];
                secondModeTaken = true;
            }
        }

        int range = list[num - 1] - list[0];

        bw.write(avg + "\n");
        bw.write(mid + "\n");
        bw.write(mode + "\n");
        bw.write(range + "");

        bw.flush();
        bw.close();
        br.close();
    }
}