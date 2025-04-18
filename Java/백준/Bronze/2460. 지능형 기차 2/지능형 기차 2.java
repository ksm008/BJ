import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 0, result = 0;

        for (int i = 0; i < 10; i++) {
            String[] str = br.readLine().split(" ");
            total += Integer.parseInt(str[1]);
            total -= Integer.parseInt(str[0]);

            if (total >= result) {
                result = total;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}