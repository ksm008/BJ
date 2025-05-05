import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int ate = Integer.parseInt(str[0]);
            int required = Integer.parseInt(str[1]);

            if (ate >= required) {
                bw.write("MMM BRAINS\n");
            } else {
                bw.write("NO BRAINS\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}