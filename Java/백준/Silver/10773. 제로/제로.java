import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[]  numArray = new int[num];
        int idxCount = 0;

        for (int i = 0; i < num; i++) {

            int jaemin = Integer.parseInt(br.readLine());
            if (jaemin == 0 && idxCount == 0) {
                numArray[idxCount] = 0;
            } else if (jaemin == 0 && idxCount > 0) {
                numArray[idxCount - 1] = 0;
                idxCount--;
            } else {
                numArray[idxCount] = jaemin;
                idxCount++;
            }
        }
        bw.write(Integer.toString(Arrays.stream(numArray).sum()));
        bw.flush();
        bw.close();
        br.close();
    }
}