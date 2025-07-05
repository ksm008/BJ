import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(str[i]) == num) {
                count++;
            }
        }
        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}