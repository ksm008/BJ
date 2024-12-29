import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");
            int workH = Integer.parseInt(str[3]) - Integer.parseInt(str[0]);
            int workM = Integer.parseInt(str[4]) - Integer.parseInt(str[1]);
            int workS = Integer.parseInt(str[5]) - Integer.parseInt(str[2]);

            if (workS < 0) {
                workS += 60;
                workM -= 1;
            }

            if (workM < 0) {
                workM += 60;
                workH -= 1;
            }

            bw.write(workH + " " + workM + " " + workS + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}