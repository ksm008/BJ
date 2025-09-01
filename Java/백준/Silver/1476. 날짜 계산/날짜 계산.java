import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");
        int E = Integer.parseInt(str[0]);
        int S = Integer.parseInt(str[1]);
        int M = Integer.parseInt(str[2]);

        int[] time = {1,1,1};
        int cnt = 1;

        while (true) {
            if (time[0] == E && time[1] == S && time[2] == M) {
                break;
            } else {
                if (time[0] == 15) {
                    time[0] = 1;
                } else {
                    time[0]++;
                }
                if (time[1] == 28) {
                    time[1] = 1;
                } else {
                    time[1]++;
                }
                if (time[2] == 19) {
                    time[2] = 1;
                } else {
                    time[2]++;
                }
                cnt++;
                
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();

    }
}