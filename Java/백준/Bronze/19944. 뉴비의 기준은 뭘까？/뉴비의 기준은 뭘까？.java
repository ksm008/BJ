import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        if (M == 1 || M == 2) {
            bw.write("NEWBIE!");
        } else if (N >= M) {
            bw.write("OLDBIE!");
        } else {
            bw.write("TLE!");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}