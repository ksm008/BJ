import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int study = 0;
        for (int i = 0; i < num; i++) {
            study += Integer.parseInt(str[i]);
        }

        int rest = (num - 1) * 8;
        int time = study + rest;

        int days = time / 24;
        int hours = time % 24;

        bw.write(days + " " + hours);

        bw.flush();
        bw.close();
        br.close();
    }
}