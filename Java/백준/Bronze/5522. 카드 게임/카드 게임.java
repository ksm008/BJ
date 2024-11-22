import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int temp = 0;

        for (int i = 0; i < 5; i++) {
            temp += num[i];
        }

        bw.write(Integer.toString(temp));
        bw.flush();
        bw.close();
        br.close();
    }
}