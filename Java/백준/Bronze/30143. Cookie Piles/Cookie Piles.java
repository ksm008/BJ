import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int A = Integer.parseInt(str[1]);
            int D = Integer.parseInt(str[2]);

            int result = N * (2 * A + (N - 1) * D) / 2;
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}