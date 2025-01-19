import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int train = 0;
        int current = 0;

        for (int i = 0; i < 4; i++) {
            String[] str = br.readLine().split(" ");
            train -= Integer.parseInt(str[0]);
            train += Integer.parseInt(str[1]);

            if (train > current) {
                current = train;
            }
        }

        bw.write(current + "");

        bw.flush();
        bw.close();
        br.close();
    }
}