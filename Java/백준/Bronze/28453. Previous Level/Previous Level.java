import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            int level = Integer.parseInt(str[i]);
            if (level == 300) {
                bw.write(1 + " ");
            } else if (level < 300 && level >= 275) {
                bw.write(2 + " ");
            } else if (level < 275 && level >= 250) {
                bw.write(3 + " ");
            } else {
                bw.write(4 + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}