import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] NumArray = new int[num];
        String[] str2 = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            NumArray[i] = Integer.parseInt(str2[i]);
        }
        Arrays.sort(NumArray);

        bw.write(NumArray[0] + " " + NumArray[num-1]);

        bw.flush();
        bw.close();
        br.close();
    }
}