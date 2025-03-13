import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        int result1 = A + B;
        int result2 = A - B;

        if (result1 > result2) {
            bw.write(result1 + "\n");
            bw.write(result2 + "");
        } else {
            bw.write(result2 + "\n");
            bw.write(result1 + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}