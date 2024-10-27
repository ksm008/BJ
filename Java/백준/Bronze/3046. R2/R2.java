import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int R1 = Integer.parseInt(str[0]);
        int ave = Integer.parseInt(str[1]);
        int R2 = ave * 2 - R1;

        bw.write(Integer.toString(R2));

        bw.flush();
        bw.close();
        br.close();
    }
}