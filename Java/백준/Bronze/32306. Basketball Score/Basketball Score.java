import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");

        int point1 = Integer.parseInt(str1[0]) + Integer.parseInt(str1[1]) * 2 + Integer.parseInt(str1[2]) * 3;
        int point2 = Integer.parseInt(str2[0]) + Integer.parseInt(str2[1]) * 2 + Integer.parseInt(str2[2]) * 3;

        if (point1 > point2) {
            bw.write("1");
        } else if (point1 < point2) {
            bw.write("2");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}