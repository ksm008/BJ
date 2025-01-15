import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hour = 0; int minute = 0;
        int total = 0;
        for (int i = 0; i < 4; i++) {
            int temp = Integer.parseInt(br.readLine());

            total += temp;
        }

        hour  = total / 60;
        minute = total % 60;

        bw.write(hour + "\n");
        bw.write(minute + "");

        bw.flush();
        bw.close();
        br.close();
    }
}