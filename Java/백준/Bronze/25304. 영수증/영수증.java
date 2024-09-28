import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i, total = 0;
        long X = Long.parseLong(br.readLine());
        long N = Long.parseLong(br.readLine());

        for (i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            total += A * B;
        }

        if (X == total) {
            bw.write("Yes\n");
            bw.flush();
        } else {
            bw.write("No\n");
            bw.flush();
        }
        bw.close();
    }
}