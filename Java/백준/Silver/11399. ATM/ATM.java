import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] minute = new int[num];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            minute[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(minute);
        int result = 0;
        int temp = 0;
        for (int numb : minute) {
            temp += numb;
            result += temp;
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}