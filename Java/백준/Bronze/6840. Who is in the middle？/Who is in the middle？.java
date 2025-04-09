import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numLists = new int[3];

        for (int i = 0; i < 3; i++) {
            numLists[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numLists);

        bw.write(numLists[1] + "");

        bw.flush();
        bw.close();
        br.close();
    }
}