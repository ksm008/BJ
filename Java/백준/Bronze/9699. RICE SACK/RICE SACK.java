import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0;  i < num ; i++) {
            String[] str = br.readLine().split(" ");
            int temp = 0;

            for (int j = 0; j < 5; j++) {
                if (Integer.parseInt(str[j]) > temp) {
                    temp = Integer.parseInt(str[j]);
                }
            }
            bw.write("Case #" + (i + 1) + ": " + temp);
            if (i != num - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}