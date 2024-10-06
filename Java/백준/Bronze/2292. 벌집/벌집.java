import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int roomCnt = 1, first = 2, end = 7;
        while(true) {
            if (num == 1) {
                break;
            } else if (num >= first && num <= end) {
                roomCnt++;
                break;
            } else {
                roomCnt++;
                first = end + 1;
                end += (6 * roomCnt);
            }
        }

        bw.write(Integer.toString(roomCnt));
        bw.flush();
        bw.close();
        br.close();
    }
}