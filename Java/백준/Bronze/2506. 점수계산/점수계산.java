import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int cnt = 0, points = 0;

        for (String str1 : str) {
            if (str1.equals("1")) {
                cnt++;
                points += cnt;
            } else {
                cnt = 0;
            }
        }

        bw.write(points + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
