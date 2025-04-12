import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int aCnt = 1;
        int bCnt = 0;

        for (int i = 0; i < num; i++) {
            int temp = bCnt;
            bCnt = aCnt + bCnt;
            aCnt = temp;
        }

        bw.write(aCnt + " " + bCnt);

        bw.flush();
        bw.close();
        br.close();
    }
}