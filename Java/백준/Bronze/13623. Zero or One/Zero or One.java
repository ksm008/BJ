import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        if (A != B && A != C) {
            bw.write("A");
        } else if (B != A && B != C) {
            bw.write("B");
        } else if (C != A && C != B) {
            bw.write("C");
        } else {
            bw.write("*");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}