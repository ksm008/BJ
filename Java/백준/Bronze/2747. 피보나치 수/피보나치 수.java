import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int[] fibo = new int[num + 1];

        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= num; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        bw.write(fibo[num] + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}
