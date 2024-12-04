import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] str = br.readLine().split(" ");

            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);

            if (A == 0 && B == 0) {
                break;
            }

            if (A > B) {
                bw.write("Yes");
            } else {
                bw.write("No");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
