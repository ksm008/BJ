import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 0;
        for (int i = 0; i < 5 ;i++) {
            int temp = Integer.parseInt(br.readLine());

            if (temp < 40) {
                temp = 40;
            }

            total += temp;
        }

        bw.write(Integer.toString(total / 5));

        br.close();
        bw.flush();
        bw.close();
    }
}