import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[] numArray = new int[num];

        for (int i = 0; i < num; i++) {
            numArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArray);

        for (int i = 0; i < num; i++) {
            bw.write(numArray[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}