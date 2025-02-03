import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int ramen = Integer.parseInt(str[0]);
            int water = Integer.parseInt(str[1]);
            int amount = Integer.parseInt(str[2]);

            bw.write(ramen * (amount - 1) + water + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}