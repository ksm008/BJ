import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int youngSik = 0, minSik = 0;

        String[] str = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            int time = Integer.parseInt(str[i]);

            youngSik += (time / 30 + 1) * 10;
            minSik += (time / 60 + 1) * 15;
        }

        if (youngSik == minSik) {
            bw.write("Y M " + youngSik);
        } else if (youngSik > minSik) {
            bw.write("M " + minSik);
        } else {
            bw.write("Y " + youngSik);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}