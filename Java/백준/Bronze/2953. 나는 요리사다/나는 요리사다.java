import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;
        int result = 0;

        for (int i = 0; i < 5; i++) {
            String[] str = br.readLine().split(" ");
            int temp = 0;

            for (int j = 0; j < 4; j++) {
                temp += Integer.parseInt(str[j]);
            }

            if (temp > result) {
                result = temp;
                num = i + 1;
            }
        }

        bw.write(num + " " + result);

        bw.flush();
        bw.close();
        br.close();
    }
}