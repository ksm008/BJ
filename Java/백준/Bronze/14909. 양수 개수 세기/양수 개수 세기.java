import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > 0) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}