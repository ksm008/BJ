import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int flyAway = 1;
        int result = 0;
        while (true) {
            if (flyAway > num) {
                flyAway = 1;
            }
            if (num == 0) {
                break;
            }
            num -= flyAway;
            flyAway++;
            result++;
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}