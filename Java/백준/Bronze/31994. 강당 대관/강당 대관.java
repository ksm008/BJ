import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String result = "";
        int temp = 0;

        for (int i = 0; i < 7; i++) {
            String[] str = br.readLine().split(" ");

            if (temp < Integer.parseInt(str[1])) {
                temp = Integer.parseInt(str[1]);
                result = str[0];
            }
        }

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}