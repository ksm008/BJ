import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int totalLine = num * 2 - 1;
        int blnkCnt = 1;
        int starCnt = 1;

        // 별 뒤의 공백은 필요없었다...
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0;  j < num - blnkCnt; j++) {
                bw.write(" ");
            }
            for(int j = 0; j < starCnt; j++) {
             bw.write("*");
            }
            bw.newLine();
            if (i != num - 2) {
                blnkCnt++;
                starCnt += 2;
            }
        }
        for (int i = 0; i < totalLine; i++) {
            bw.write("*");
        }
        bw.newLine();
        for (int i = 0; i < num - 1; i++) {
            for (int j = num - blnkCnt;  j > 0; j--) {
                bw.write(" ");
            }
            for(int j = starCnt; j > 0; j--) {
                bw.write("*");
            }
            blnkCnt--;
            starCnt -= 2;
            if (i != num - 2) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}